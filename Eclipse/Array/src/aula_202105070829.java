import java.util.Scanner;

public class aula_202105070829 {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		int somapar=0,quantimpar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++) {
			System.out.println("Digite um número: ");
			numeros[x] = leia.nextInt();
			
			if(numeros[x]%2==0) {
				somapar = somapar + numeros[x];
			}
			
			else {
				quantimpar++;
			}
		}
		
		for(x=0;x<5;x++) {
			if(numeros[x]%2==0) {
				System.out.println("Número: "+numeros[x]+" <-- Este número é par.");
			}
			
			else {
				System.out.println("Número: "+numeros[x]+" <-- Este número é ímpar.");
			}
		}
		
		System.out.println("\nSomatória de pares: "+somapar);
		System.out.println("\nQuantidade de ímpares: "+quantimpar);

	}

}
