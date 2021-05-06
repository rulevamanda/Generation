import java.util.Scanner;

public class exercicio4_202105061254 {

	public static void main(String[] args) {
		/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas
		 * dos indivíduos de uma região.
		 * Para tanto, a cada uma das pessoas era perguntado:
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e
		 * 3, se a pessoa era agressiva).
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
		 * calcule e mostre: (WHILE)
		 * número de pessoas calmas;
		 * número de mulheres nervosas;
		 * número de homens agressivos;
		 * número de outros calmos;
		 * número de pessoas nervosas com mais de 40 anos;
		 * número de pessoas calmas com menos de 18 anos.
		*/
		
		Scanner read = new Scanner(System.in);
		
		int ppl=1,fem=0,masc=0,oth=0,calm=0,nerv=0,aggr=0,idade,sex,options,
				maior40=0,menor18=0,nerv40=0,calm18=0,femnerv=0,mascaggr=0,othcalm=0;
		
		while(ppl<=150) {
			
			System.out.println("Qual a sua idade?");
			idade = read.nextInt();
			
			if(idade<18) {
				menor18 = menor18 + 1;
			}
			
			if(idade>40) {
				maior40=maior40 + 1;
			}
			
			System.out.println("Você é (1)mulher, (2)homem, ou (3)outre?");
			sex=read.nextInt();
			
			if(sex==1) {
				fem=fem + 1;
			}
			
			if(sex==2) {
				masc=masc + 1;
			}
			
			if(sex==3) {
				oth=oth + 1;
			}
			
			System.out.println("Você é (1)calme, (2)nervose, ou (3)agressive?");
			options = read.nextInt();
			
			if(options==1) {
				calm = calm+1;
			}
			
			if(options==2) {
				nerv = nerv+1;
			}
			
			if(options==3) {
				aggr = aggr+1;
			}
			
			if(sex==1&&options==2){
				femnerv=femnerv + 1;
			}
			
			if(sex==2&&options==3) {
				mascaggr=mascaggr + 1;
			}
			
			if(sex==3&&options==1) {
				othcalm=othcalm + 1;
			}

			if(idade>40&&options==2) {
				nerv40=nerv40 + 1;
			}

			if(idade<18&&options==1) {
				calm18=calm18 + 1;
			}
			ppl = ppl+1;
		}
		
		System.out.println("\nPessoas calmes: "+calm);
		System.out.println("\nMulheres calmas: "+femnerv);
		System.out.println("\nHomens agressivos: "+mascaggr);
		System.out.println("\nOutros calmes: "+othcalm);
		System.out.println("\nPessoas nervoses com mais de 40 anos: "+nerv40);
		System.out.println("\nPessoas calmes com menos de 18 anos: "+calm18);


	}

}
