package exercicio5;

public class TestePatinete {
	
	public static void main(String[] args) {
		
		Patinete novo = new Patinete("Firebolt","m�dio","vermelho");
		
		novo.imprimirInfo();
		System.out.println("***Pintura e acabamento***");
		novo.setCor("azul");
		novo.imprimirInfo();		
		
	}

}
