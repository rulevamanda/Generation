package exercicio7;

public class TestePaciente {

	public static void main(String[] args) {
		// instanciando um objeto da classe ClassePaciente
		
		Paciente TestePaciente = new Paciente("Jack",14,"fêmea","felino",2.3,25,"AB","linfoma");
		
		//troca de mensagens (chamada ao metodo imprimirInfo())
		TestePaciente.imprimirInfo();
		System.out.println("\n***RETORNO***");
		TestePaciente.setDiagnostico("em remissão");
		TestePaciente.setPeso(3.5);
		TestePaciente.imprimirInfo();

	}

}
