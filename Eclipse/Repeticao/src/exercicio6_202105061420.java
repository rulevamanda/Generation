import java.util.Scanner;

public class exercicio6_202105061420 {

	public static void main(String[] args) {
		/* Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
		 * Para sair digitar  0(zero).(DO...WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int num,sum=0,avg=0,count=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num=read.nextInt();
			
			if(num%3==0) {
				sum=sum+num;
				count=count+1;
			}
		}
		while(num!=0);
		
		avg=sum/count;
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: "+avg);
	}
		
}