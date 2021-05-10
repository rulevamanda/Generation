package exercicio5;

public class TestePatinete {
	
	public static void main(String[] args) {
		
		Patinete novo = new Patinete("Firebolt","médio","vermelho");
		
		novo.imprimirInfo();
		System.out.println("***Pintura e acabamento***");
		novo.setCor("azul");
		novo.imprimirInfo();		
		
	}

}
