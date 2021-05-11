package exercicio4;

import java.text.NumberFormat;

public class Funcionario {
	
	/*Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe,
	 * em seguida crie um objeto funcion�rio, defina as instancias deste objeto
	 * e apresente as informa��es deste objeto no console.
	 */
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome,double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void printInfo() {
		System.out.println(nome+"\t->\t"+this.formatarMoeda());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	


}
