package aula;

public class aula_202105101116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe aula_202105101116
		
		aula_2021105101043 auto1 = new aula_2021105101043("Bruno","Ferrari","48B7596",2021);
		
		//troca de mensagens (chamada ao metodo imprimirInfo())
		auto1.imprimirInfo();
		System.out.println("\n***Transfer�ncia de Propriet�rie***");
		auto1.setNomeProprietarie("Tokunbo");
		auto1.imprimirInfo();
		
		aula_2021105101043 auto2 = new aula_2021105101043 ("Amanda","Defender","UDP4711",2018);
		auto2.imprimirInfo();
		System.out.println("\n***Mudan�a de Placa***");
		auto2.setPlaca("KRP2012");
		auto2.imprimirInfo();

	}

}
