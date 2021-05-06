import java.util.Scanner;

public class exercicio3_202105061243 {

	public static void main(String[] args) {
		/* Solicitar a idade de várias pessoas e imprimir:
		Total de pessoas com menos de 21 anos.
		Total de pessoas com mais de 50 anos.
		O programa termina quando idade for =-99. (WHILE)
		*/
		
		Scanner leia = new Scanner(System.in);		
		
		int idade=0,menor21=0,maior50=0;
		
		while(idade!=-99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				menor21 = menor21 + 1;
			}
			
			if(idade>50) {
				maior50 = maior50 + 1;
			}
		}
		
		System.out.println("Total de pessoas menores que 21 é: "+menor21);
		System.out.println("Total de pessoas maiores que 50 é: "+maior50);
	}

}
