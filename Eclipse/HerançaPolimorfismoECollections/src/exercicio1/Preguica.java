package exercicio1;

public class Preguica extends Animal{
	
	public Preguica(String nome,int idade,String som,String movimento) {
		super(nome,idade,som,movimento);
	}

	public void printInfo() {
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom que emite: "
				+getSom()+"\nMovimento que faz: "+getMovimento());
	}

	

}
