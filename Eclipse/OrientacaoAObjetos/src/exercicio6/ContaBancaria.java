package exercicio6;

public class ContaBancaria {
	/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
	 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto
	 * e apresente as informações deste objeto no console.
	 */
	
	// declaração de atributos da classe
	private String nome;
	private int agencia;
	private int conta;
	private double saldo;
	
	//criação do método construtor
	public ContaBancaria(String nome,int agencia,int conta,double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void imprimirInfo() {
		System.out.println(nome+", com conta nº"+conta+" na agência nº"+agencia+
							" tem saldo de "+saldo+" peças de ouro aprovadas pelo império.");
	}

	//declaração dos métodos da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
