package aula_202105101557;

import java.util.Scanner;

public class Cliente {
	
	Scanner ler = new Scanner(System.in);
	
	double vp,vt; //vp=valor do produto, vt=valor total
	
	private String nomeCliente;
	private int codigoCliente;
	
	public Cliente(String nome,int codigoCliente) {
		this.nomeCliente = nome;
		this.codigoCliente = codigoCliente;
	}
	
	public Scanner getLer() {
		return ler;
	}
	
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	
	public double getVp() {
		return vp;
	}
	
	public void stVp(double vp) {
		this.vp = vp;
	}
	
	public double getVt() {
		return vt;
	}
	
	public void stVt(double vt) {
		this.vt = vt;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public double valor(double vt) {
		System.out.println("O valor de cada produto deve ser inserido individualmente.\nPara finalizar entre o zero ou um número negativo.");
		do {
			System.out.println("\nEntre com o valor: ");
			vp = ler.nextDouble();
			vt = vt+vp;
		}
		while(vp>0.0);
		return vt;
	}
	
	public String getInfo() {
		String info = nomeCliente+"\t\t"+codigoCliente;
		return info;
	}
	
	public void compra() {
		System.out.printf("Total: %.2f\n",valor(0.0));
	}

}
