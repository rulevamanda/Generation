import java.util.Scanner;

public class exercicio1_202105050941 {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int num,cont=0,maior=0;
					
		Scanner leia = new Scanner(System.in);
					
		while(cont<3){
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			if(maior<num) {
				maior = num;
			}
			cont++;
		}
				
		System.out.println("O maior número é: "+maior);
	}


}
