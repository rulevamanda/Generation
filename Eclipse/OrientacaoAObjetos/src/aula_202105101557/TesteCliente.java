package aula_202105101557;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Angelo",1234);
		cliente1.compra();
		System.out.println(cliente1.getInfo());
		
		
		
	}

}
