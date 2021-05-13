package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {

		int op;//op��o
				
		Scanner read = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("(1) Adicionar produtos ao estoque");
			System.out.println("(2) Remover produtos do estoque");
			System.out.println("(3) Atualizar produtos do estoque");
			System.out.println("(4) Mostrar todos os produtos do estoque");
			System.out.println("(0) Encerrar o programa");
			System.out.println("Digite sua op��o: ");
			op = read.nextInt();
			
			
			switch(op) {
			case 1:
				read.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = read.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				read.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = read.nextLine();
				if(estoque.contains(produto1)) {
					estoque.remove(produto1);
				}
				else {
					System.err.println("\nProduto n�o exite no estoque.");
				}
				break;
			
			case 3:
				read.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = read.nextLine();
				System.out.println("\nDigite o nome do produto que estrar� no lugar de "+verifica+": ");
				String novo = read.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else {
					System.err.println("\nProduto n�o exite no estoque.");
				}
				break;
			
			case 4:
				read.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
				System.out.println("\nMostrando os produtos do estoque:");
				System.out.println(estoque);
				break;
				
			default:
				System.out.println("\nFinalizou o programa");
			}
		}while(op!=0);//condi��o de sa�da
	}

}
