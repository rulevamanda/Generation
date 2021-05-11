package exercicio1;

public class Animal {
	
	private String nome;
	private int idade;
	private String som;
	private String movimento;
	
	public Animal(String nome,int idade,String som,String movimento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.movimento = movimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
	


	
	
	

}
