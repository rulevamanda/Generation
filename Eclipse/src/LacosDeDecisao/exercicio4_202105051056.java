import java.util.Scanner;

public class LacosDeDecisao4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que permita a entrada de um n�mero qualquer
		 * e exiba se este n�mero � par ou �mpar.
		 * Se for par, exiba tamb�m a raiz quadrada do mesmo;
		 * se for �mpar, exiba o n�mero elevado ao quadrado.
		 */
		
		double num;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		num = leia.nextFloat();
		
		if(num%2==0) {
			System.out.printf("\nEste n�mero � PAR e sua raiz quadrada � igual a %.2f",Math.sqrt(num));
		}
		
		if(num%2!=0) {
			System.out.printf("\nEste n�mero � �MPAR e o mesmo elevado ao quadrado � igual a %.2f",Math.pow(num, 2));
		}

	}

}
