package aula_202105110929;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor felipe = new Fornecedor("Felipe","Rua Pascoal, 222","12345432356",988938389,18,25000,10000);
		
		felipe.imprimirInfo();
		felipe.validarCpf();
		felipe.obterSaldo();
	}

}
