import java.util.Scanner;

public class exercicio5_202105061406 {

	public static void main(String[] args) {
		/* Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int num,soma=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = read.nextInt();
			
			soma=soma+num;
		}
		
		while(num!=0);
		
		System.out.println("A soma dos n�meros digitados �: "+soma);
		


	}

}
