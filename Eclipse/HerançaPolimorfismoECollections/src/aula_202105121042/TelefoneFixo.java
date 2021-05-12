package aula_202105121042;

public class TelefoneFixo extends Telefone{
	
	public TelefoneFixo() {
		super("Fixo");
	}
	
	@Override
	public void toca(int numToques) {
		for(int i=0;i<numToques;i++) {
			System.out.println("\nHelloMoto");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: "+numero);
	}

}
