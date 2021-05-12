package aula_202105121404;

public class TestaFiguras {

	public static void main(String[] args) {
		
		Quadrado fig1 = new Quadrado(10,"Quadrado1");
		Retangulo fig2 = new Retangulo(3,4,"Retangulo 1");
		
		System.out.println(fig1.getNome()+": "+fig1.getDiagonal());
		System.out.println(fig2.getNome()+": "+fig2.getDiagonal());


	}

}
