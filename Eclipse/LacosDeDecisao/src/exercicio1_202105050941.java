import java.util.Scanner;

public class exercicio1_202105050941 {

	public static void main(String[] args) {
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int num,cont=0,maior=0;
					
		Scanner leia = new Scanner(System.in);
					
		while(cont<3){
			System.out.println("Insira um n�mero: ");
			num = leia.nextInt();
			if(maior<num) {
				maior = num;
			}
			cont++;
		}
				
		System.out.println("O maior n�mero �: "+maior);
	}


}
