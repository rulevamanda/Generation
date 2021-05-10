package aula_202105101506;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Isadora",3000);
		lista[1] = new Empregado("Gustavo",4500);
		lista[2] = new Empregado("Amanda",6000);
		
		for(Empregado roda:lista) {
			roda.Imprimir();
		}
		
		System.out.println("***********");
		
		for(Empregado go:lista) {
			go.aumentarSalario(10);
			go.Imprimir();
		}
		
		System.out.println("***********");
		
		Empregado gerente = new Empregado("Felipe",15000);
		gerente.Imprimir();
		gerente.aumentarSalario(20);
		System.out.println("***********");
		gerente.Imprimir();
	
	
	
	}
	

}
