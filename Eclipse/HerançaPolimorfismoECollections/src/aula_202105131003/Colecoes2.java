package aula_202105131003;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {

		int op;//opção
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n---------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Atualizar produtos do estoque?");
			System.out.println("\n(4) Mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\n Digite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();//lê uma String para esvaziar o buffer de memória (para não ficar sujeira na memória
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();//lê uma String para esvaziar o buffer de memória (para não ficar sujeira na memória
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1)) {
					estoque.remove(produto1);
				}
				else {
					System.err.println("\nProduto não exite no estoque.");
				}
				break;
			
			case 3:
				leia.nextLine();//lê uma String para esvaziar o buffer de memória (para não ficar sujeira na memória
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que estrará no lugar de "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else {
					System.err.println("\nProduto não exite no estoque.");
				}
				break;
			
			case 4:
				leia.nextLine();//lê uma String para esvaziar o buffer de memória (para não ficar sujeira na memória
				System.out.println("\nMostrando os produtos do estoque:");
				System.out.println(estoque);
				break;
				
			default:
				System.out.println("\nFinalizou o programa");
			}
		}while(op!=0);//condição de saída
	}

}
