package aula_202105121404;

public class Quadrado extends BaseFigura implements Figuras{
	
	Quadrado(double lado,String nome){
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal() {//tem na interface
		return Math.sqrt(2)*lado1;
	}
	
	

}
