package aula_202105131408;

public class Excecao {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) {//tratamento de exceção
			System.out.println("A frase inicial estpa nula, para solucionar o problema, foi lhe atribuído um valor default.");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);
	}

}
