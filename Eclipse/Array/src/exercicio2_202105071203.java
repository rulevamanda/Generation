import java.util.Scanner;

public class exercicio2_202105071203 {

	public static void main(String[] args) {
		/* Faça um programa que receba 6 números inteiros e mostre:
		• Os números pares digitados;
		• A soma dos números pares digitados;
		• Os números ímpares digitados;
		• A quantidade de números ímpares digitados.
		*/

		Scanner read = new Scanner(System.in);
		
		int[] n = new int[6];
		int[] par = new int[6];
		int[] impar = new int[6];
		
		int x,quantp=0,sump=0,p=0,quanti=0,sumi=0,i=0;

		 for(x=0;x<6;x++){
		     System.out.println("Digite um número: ");
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
		 
		 System.out.printf("\nOs números pares digitados são: ");
		 
		 for(p=0;p<quantp;p++){
			 System.out.printf("%d, ",par[p]);			          
		 }
		 
		 System.out.println("\nA soma dos números pares digitados é: "+sump);
		 System.out.println("A quantidade de números pares digitados é: "+quantp);
		 
		 for(x=0;x<6;x++){
		     if(n[x]%2!=0){
		    	 sumi=sumi+n[x];
		    	 quanti++;
		         impar[i]=n[x]; 
		         i++;
		        }    
		 }
		 
		 System.out.printf("\nOs números ímpares digitados são: ");

		 for(i=0;i<quanti;i++){
			 System.out.printf("%d, ",impar[i]);			          
		 }
		 
		 System.out.println("\nA soma dos números ímpares digitados é: "+sumi);
		 System.out.println("A quantidade de números ímpares digitados é: "+quanti);
				
	}

}