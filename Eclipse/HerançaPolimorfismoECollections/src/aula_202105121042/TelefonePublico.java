package aula_202105121042;

public class TelefonePublico extends Telefone{
	
	public TelefonePublico() {
		super("Publico");
	}
	
	@Override
	public void toca(int numToques) {
		for(int i=0;i<numToques;i++) {
			System.out.println("\nTrimtrimtrim...Trimtrimtrim...Trimtrimtrim...");
		}
	}
	
	@Override
	public void disca(String numero) {
		if(numero.charAt(0)=='9'||numero.charAt(0)=='8') {
			System.out.println("\nEste telefone não liga para celulares.");
		}
		else {
			System.out.println("\nDiscando: "+numero);
		}
	}

}
