import java.util.Scanner;

public class aula_202105060922 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,media,somamedia=0,mediageral;
		int x;//vari�vel de loop
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=3;x++) {
			System.out.println("\nDigite a primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("Digite a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("Digite a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1+nota2+nota3)/3;
			System.out.printf("\nM�dia aluno "+x+": %2.2f",media);
			somamedia = somamedia + media;
		}
		mediageral = somamedia / 3;
		System.out.println("\nM�dia geral: "+mediageral);
		
		int num,somapar=0,somaimpar=0;
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		
		while(num!=0) {
			if(num%2==0) {
				somapar = somapar + num;
			}
			else {
				somaimpar = somaimpar +num;
			}
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
		}
		System.out.println("\nSomat�ria dos n�meros pares: "+somapar);
		System.out.println("\nSomat�ria dos n�meros �mpares: "+somaimpar);
		
		int somanum=0;
		
		System.out.println("\nDigite um n�mero: ");
		num = leia.nextInt();
		
		do {
			somanum = somanum + num;
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
		}
		while(num<0);
		System.out.println("\nSomat�ria dos n�meros: "+somanum);
	}	
}