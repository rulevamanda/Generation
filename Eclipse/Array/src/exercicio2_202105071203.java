import java.util.Scanner;

public class exercicio2_202105071203 {

	public static void main(String[] args) {
		/* Fa�a um programa que receba 6 n�meros inteiros e mostre:
		� Os n�meros pares digitados;
		� A soma dos n�meros pares digitados;
		� Os n�meros �mpares digitados;
		� A quantidade de n�meros �mpares digitados.
		*/

		Scanner read = new Scanner(System.in);
		
		int[] n = new int[6];
		int[] par = new int[6];
		int[] impar = new int[6];
		
		int x,quantp=0,sump=0,p=0,quanti=0,sumi=0,i=0;

		 for(x=0;x<6;x++){
		     System.out.println("Digite um n�mero: ");
		     n[x] = read.nextInt();               
		 }
		 
		 for(x=0;x<6;x++){
		     if(n[x]%2==0){
		    	 sump = sump+n[x];
		    	 quantp++;
		         par[p] = n[x]; 
		         p++;
		        }         
		 }
		 
		 System.out.printf("\nOs n�meros pares digitados s�o: ");
		 
		 for(p=0;p<quantp;p++){
			 System.out.printf("%d, ",par[p]);			          
		 }
		 
		 System.out.println("\nA soma dos n�meros pares digitados �: "+sump);
		 System.out.println("A quantidade de n�meros pares digitados �: "+quantp);
		 
		 for(x=0;x<6;x++){
		     if(n[x]%2!=0){
		    	 sumi=sumi+n[x];
		    	 quanti++;
		         impar[i]=n[x]; 
		         i++;
		        }    
		 }
		 
		 System.out.printf("\nOs n�meros �mpares digitados s�o: ");

		 for(i=0;i<quanti;i++){
			 System.out.printf("%d, ",impar[i]);			          
		 }
		 
		 System.out.println("\nA soma dos n�meros �mpares digitados �: "+sumi);
		 System.out.println("A quantidade de n�meros �mpares digitados �: "+quanti);
				
	}

}