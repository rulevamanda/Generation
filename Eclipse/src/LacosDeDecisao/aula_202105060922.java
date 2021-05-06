import java.util.Scanner;

public class aula_202105060922 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,media,somamedia=0,mediageral;
		int x;//variável de loop
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=3;x++) {
			System.out.println("\nDigite a primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("Digite a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("Digite a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1+nota2+nota3)/3;
			System.out.printf("\nMédia aluno "+x+": %2.2f",media);
			somamedia = somamedia + media;
		}
		mediageral = somamedia / 3;
		System.out.println("\nMédia geral: "+mediageral);
		
		int num,somapar=0,somaimpar=0;
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		while(num!=0) {
			if(num%2==0) {
				somapar = somapar + num;
			}
			else {
				somaimpar = somaimpar +num;
			}
			System.out.println("Digite um número: ");
			num = leia.nextInt();
		}
		System.out.println("\nSomatória dos números pares: "+somapar);
		System.out.println("\nSomatória dos números ímpares: "+somaimpar);
		
		int somanum=0;
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		do {
			somanum = somanum + num;
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
		}
		while(num<0);
		System.out.println("\nSomatória dos números: "+somanum);
	}	
}