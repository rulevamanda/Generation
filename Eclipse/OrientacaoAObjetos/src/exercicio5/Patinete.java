package exercicio5;

public class Patinete {
	/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
	 * em seguida crie um objeto patinete, defina as instancias deste objeto
	 * e apresente as informações deste objeto no console.
	 */
	
	// declaração de atributos da classe
	private String modelo;
	private String tamanho;
	private String cor;
	
	//criação do método construtor
	public Patinete(String modelo,String tamanho, String cor) {
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public void imprimirInfo() {
		System.out.println("O patinete "+modelo+" é "+tamanho+" e "+cor+".");
	}

	//declaração dos métodos da classe
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
