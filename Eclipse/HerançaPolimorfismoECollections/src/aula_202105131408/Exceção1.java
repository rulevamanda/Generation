package aula_202105131408;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exce��o1 {
	
	//demonstra lan�amento de uma exce��o quando ocorre uma divis�o por 0
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException{
		return numerador /denominador;//possibilitar a divas�o por zero
	}
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		boolean continueLoop = true;
		
		do {
			try {
				//l� dois npumeros e calcula o quociente
				System.out.println("\nDigite o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nDigite o denominador: ");
				int denominador = leia.nextInt();
				
				int result = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d",numerador,denominador,result);
				continueLoop = false;
			}
			
			catch(InputMismatchException inputMismatchException) {
				System.err.printf("\nExceptption: %s\n",inputMismatchException);
				leia.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo inteiro. Por favor, tente novamente.\n");
			}
			
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n",arithmeticException);
				System.out.println("\nZero � um denominador inv�lido. Por favor tente novamente");
				
			}
		}while(continueLoop);
	}

}
