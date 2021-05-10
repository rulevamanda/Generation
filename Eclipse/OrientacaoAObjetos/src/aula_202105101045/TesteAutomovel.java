package aula_202105101045;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe aula_202105101116
		
		Automovel auto1 = new Automovel("Bruno","Ferrari","48B7596",2021);
		
		//troca de mensagens (chamada ao metodo imprimirInfo())
		auto1.imprimirInfo();
		System.out.println("\n***TransferÊncia de Proprietárie***");
		auto1.setNomeProprietarie("Tokunbo");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel ("Amanda","Defender","UDP4711",2018);
		auto2.imprimirInfo();
		System.out.println("\n***Mudança de Placa***");
		auto2.setPlaca("KRP2012");
		auto2.imprimirInfo();

	}

}
