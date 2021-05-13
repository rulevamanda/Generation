package aula_202105131515;

import java.util.Optional;

public class Opcional {
	
	public static void main(String[] args) {
		
		Optional<String> linguagem = Optional.of("BRUNO");
		String respostaPreenchida = "SIM";
		String respostaNula = null;
		
		System.out.println("\nOptional não vazio: "+linguagem);
		System.out.println("\nOptional não vazio: Obtém valor"+linguagem.get());
		System.out.println("\nOptional vazio: "+Optional.empty());
		System.out.println("\nChamada de método ofNullable() em Optional não vazio: "+Optional.ofNullable(respostaPreenchida));
		System.out.println("\nChamada do método ofNullable() em Optional vazio: "+Optional.ofNullable(respostaNula));
	}

}
