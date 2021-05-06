import java.util.Scanner;

public class LacosDeDecisao4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que permita a entrada de um número qualquer
		 * e exiba se este número é par ou ímpar.
		 * Se for par, exiba também a raiz quadrada do mesmo;
		 * se for ímpar, exiba o número elevado ao quadrado.
		 */
		
		double num;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		num = leia.nextFloat();
		
		if(num%2==0) {
			System.out.printf("\nEste número é PAR e sua raiz quadrada é igual a %.2f",Math.sqrt(num));
		}
		
		if(num%2!=0) {
			System.out.printf("\nEste número é ÍMPAR e o mesmo elevado ao quadrado é igual a %.2f",Math.pow(num, 2));
		}

	}

}
