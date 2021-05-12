package exercicio2;

public class AnimaisCachorro extends Animais{
	
	public AnimaisCachorro() {
		super("cachorro");
	}
	
	@Override
	public void som(String som) {
		System.out.println("latindo");
	}

}
