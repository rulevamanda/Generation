package exercicio6;

import exercicio7.Paciente;

public class TesteContaBancaria {

	public static void main(String[] args) {
		// instanciando um objeto da classe ClassePaciente
		
		ContaBancaria TesteContaBancaria = new ContaBancaria("Amanda",12345,67890,400000);
		
		//troca de mensagens (chamada metodo imprimirInfo())
		TesteContaBancaria.imprimirInfo();
		System.out.println("\n***NOVA TRANSAÇÃO***");
		TesteContaBancaria.setSaldo(378256);
		System.out.println("Investimento para o exército do Imperador aplicado com sucesso.");
		TesteContaBancaria.imprimirInfo();
		

	}

}
