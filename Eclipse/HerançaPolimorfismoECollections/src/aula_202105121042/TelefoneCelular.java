package aula_202105121042;

public class TelefoneCelular extends Telefone{
	
	public TelefoneCelular() {
		super("Celular");
	}
	
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\npiririn piririn piririin alguem ligou pra mim...");
			break;
		case 2:
			System.out.println("\nSou eu bola de fogo, o calor tá de matar...");
			break;
		default:
			System.out.println("\nParanpanpan...Paranpanpan...Paranpanpan...");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: "+numero+" é um celular.");
	}

}
