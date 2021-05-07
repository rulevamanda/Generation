import java.util.Scanner;

public class exercicio3_202105071144 {

	public static void main(String[] args) {
		// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner read = new Scanner(System.in);
		
		float[][] m = new float[3][3];
		
		int l,c,cont=0;
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Digite um valor: ");
				m[l][c] = read.nextFloat();
				
				if(m[l][c]>10) {
					cont = cont+1;
				}
			}
		}
				
		System.out.println("Existem "+cont+" valores maiores que 10.");
	}
}
