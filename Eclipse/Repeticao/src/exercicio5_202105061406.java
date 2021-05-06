import java.util.Scanner;

public class exercicio5_202105061406 {

	public static void main(String[] args) {
		/* Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int num,soma=0;
		
		do {
			System.out.println("Digite um número: ");
			num = read.nextInt();
			
			soma=soma+num;
		}
		
		while(num!=0);
		
		System.out.println("A soma dos números digitados é: "+soma);
		


	}

}
