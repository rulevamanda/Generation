import java.util.Scanner;

public class aula_202105070829 {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		int somapar=0,quantimpar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++) {
			System.out.println("Digite um n�mero: ");
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
				System.out.println("N�mero: "+numeros[x]+" <-- Este n�mero � par.");
			}
			
			else {
				System.out.println("N�mero: "+numeros[x]+" <-- Este n�mero � �mpar.");
			}
		}
		
		System.out.println("\nSomat�ria de pares: "+somapar);
		System.out.println("\nQuantidade de �mpares: "+quantimpar);

	}

}
