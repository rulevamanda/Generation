package exercicio4;

import aula_202105101506.Empregado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] lista = new Funcionario[5];
		
		lista[0] = new Funcionario("Suellen",2500);
		lista[1] = new Funcionario("Richard",1800);
		lista[2] = new Funcionario("Kayla",3000);
		lista[3] = new Funcionario("Márcio",2500);
		lista[4] = new Funcionario("Hellen",3500);
		
		for(Funcionario vetor:lista) {
			vetor.printInfo();
		}
		
		System.out.println("***REAJUSTE SALARIAL***");
		
		for(Funcionario vetor:lista) {
			vetor.aumentarSalario(20);
			vetor.printInfo();
		}
		
	

		
		

	}

}
