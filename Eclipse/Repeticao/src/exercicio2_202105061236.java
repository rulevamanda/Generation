import java.util.Scanner;

public class exercicio2_202105061236 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
	        Scanner leia = new Scanner(System.in);
	        
	        int num,par=0,impar=0,i;
	        
	        for(i=1;i<=10;i++){
	            System.out.println("Digite o "+i+"º número: ");
	            num = leia.nextInt();
	            
	            if(num%2==0){
	                par++;
	            }
	            
	            if(num%2==1){
	                impar++;
	            }
	        }
	        
	        System.out.println("Foram digitados "+par+" números pares e "+impar+" números ímpares.");

	}

}
