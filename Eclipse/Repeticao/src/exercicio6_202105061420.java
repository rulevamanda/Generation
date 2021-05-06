import java.util.Scanner;

public class exercicio6_202105061420 {

	public static void main(String[] args) {
		/* Escrever um programa que receba vários números inteiros no teclado.
		 * E no final imprimir a média dos números múltiplos de 3.
		 * Para sair digitar  0(zero).(DO...WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int num,sum=0,avg=0,count=0;
		
		do {
			System.out.println("Digite um número: ");
			num=read.nextInt();
			
			if(num%3==0) {
				sum=sum+num;
				count=count+1;
			}
		}
		while(num!=0);
		
		avg=sum/count;
		
		System.out.println("A média dos números múltiplos de 3 é: "+avg);
	}
		
}