import java.util.Arrays;
import java.util.Scanner;

public class exercicio2_202105051020 {

	public static void main(String[] args) {
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner num = new Scanner(System.in);
		
		int i,j;
		int[] lista = new int[3];
		
		for (i=0;i<lista.length;i++){
			System.out.print("Digite o "+(i+1) + "� n�mero: "); 
			lista[i] = (num.nextInt());
		}

		Arrays.sort(lista);

		System.out.print("Ordem crescente: "); 
		
		for (j=0; j<lista.length;j++){
			System.out.print(lista[j]+" ");
		}
	}
}
