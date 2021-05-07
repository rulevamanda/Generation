import java.util.Scanner;

public class exercicio4_202105071305 {

	public static void main(String[] args) {
		/*Faça um programa que leia duas matrizes 2 x 2 com valores reais.
		Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes
		(2) subtrair a primeira matriz da segunda
		(3) adicionar uma constante às duas matrizes
		(4) imprimir as matrizes
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
		Na terceira opção o valor da constante deve ser lido
		e o resultado da adição da constante deve ser armazenado na própria matriz.
		*/
		
		Scanner read = new Scanner(System.in);

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		
		
		int i,j,opcao;
		float constante;
		
		//alimentando matriz1
		System.out.println("\nAlimente a matriz 1: ");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]:");
				matriz1[i][j] = read.nextFloat();
			}
		}
		
		//alimentando matriz2
		System.out.println("\nAlimente a matriz 2: ");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]:");
				matriz2[i][j] = read.nextFloat();
			}
		}
		
		System.out.print("\nEscolha uma opção:"
				+ "\n1 somar as duas matrizes"
				+ "\n2 subtrair a primeira matriz da segunda"
				+ "\n3 adicionar uma constante às duas matrizes"
				+ "\n4 imprimir as matrizes\n");
		opcao = read.nextInt();
		
		while(opcao<1||opcao>4) {
			System.err.println("\nOPÇÃO INVÁLIDA!");
			System.out.print("\nEscolha uma opção:"
					+ "\n1 somar as duas matrizes"
					+ "\n2 subtrair a primeira matriz da segunda"
					+ "\n3 adicionar uma constante às duas matrizes"
					+ "\n4 imprimir as matrizes\n");
			opcao = read.nextInt();
		}
		
		switch(opcao){
			case 1://somar as duas matrizes
				
				System.out.print("\nSoma das duas matrizes:\n");

				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j]+matriz2[i][j];
					}
				}
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print("["+matriz3[i][j]+"]");
				    }  
				    System.out.println(" ");
				}
				break;
				
			case 2://subtrair a primeira matriz da segunda

				System.out.print("\nSubtraçã da primeira matriz da segunda matriz:\n");
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz2[i][j]-matriz1[i][j];
					}
					for(i=0;i<2;i++) {
						for(j=0;j<2;j++) {
							System.out.print("["+matriz3[i][j]+"]");
					    }  
					    System.out.println(" ");
					}
				}
				break;
			
			case 3://adicionar uma constante às duas matrizes
				System.out.print("\nDigite uma constante: ");
				constante = read.nextFloat();
				
				System.out.print("\nMatriz 1 + constante:\n");
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print("["+(matriz1[i][j]+constante)+"]");
				    }  
				    System.out.println(" ");
				}
				
				System.out.print("\nMatriz 2 + constante:\n");
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print("["+(matriz2[i][j]+constante)+"]");
				    }  
				    System.out.println(" ");
				}
				break;
			
			case 4://imprimir as matrizes
				
				System.out.print("\nA matriz 1 é:\n");

				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print("["+matriz1[i][j]+"]");
				    }  
				    System.out.println(" ");
				}
				
				System.out.print("\nA matriz 2 é:\n");

				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print("["+matriz2[i][j]+"]");
				    }  
				    System.out.println(" ");
				}
				break;
	
		}	
	}
}

		