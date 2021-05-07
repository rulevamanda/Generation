import java.util.Scanner;

public class aula_202105070842 {

	public static void main(String[] args) {
		
		float[][] notas = new float[2][2];
		float somanotas=0,nota1,nota2,nota3,meida,mediageral;
		int cont=0,linha,coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("Digite a nota: ");
				notas[linha][coluna] = leia.nextFloat();
				somanotas = somanotas + notas[linha][coluna];
				cont++;
			}
		}
		mediageral = somanotas / cont;
		System.out.println("\nMédia geral: "+mediageral);

	}

}
