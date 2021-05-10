package exercicio7;

public class Paciente {
	/*Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
	 * em seguida crie um objeto paciente, defina as instancias deste objeto
	 * e apresente as informações deste objeto no console.
	 */
	
	// declaração de atributos da classe
	private String nome;
	private int idade;
	private String sexo;
	private String especie;
	private double peso;
	private int altura;
	private String tipoSanguineo;
	private String diagnostico;

	//criação do método construtor
	public Paciente(String nome,int idade,String sexo,String especie,double peso,
			int altura,String tipoSanguineo,String diagnostico) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.especie = especie;
		this.peso = peso;
		this.altura = altura;
		this.tipoSanguineo = tipoSanguineo;
		this.diagnostico = diagnostico;
	}
	
	public void imprimirInfo() {
		System.out.println(nome+", "+sexo+", "+especie+", tem "+idade+" anos, "+peso+"kg, "
							+altura+"cm, tipo sanguíneo "+tipoSanguineo+
							", e foi diagnosticade com "+diagnostico+".");
	}
	
	//declaração dos métodos da classe
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

}
