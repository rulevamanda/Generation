import java.util.Scanner;

public class exercicio2_202105061236 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
	        Scanner leia = new Scanner(System.in);
	        
	        int num,par=0,impar=0,i;
	        
	        for(i=1;i<=10;i++){
	            System.out.println("Digite o "+i+"� n�mero: ");
	            num = leia.nextInt();
	            
	            if(num%2==0){
	                par++;
	            }
	            
	            if(num%2==1){
	                impar++;
	            }
	        }
	        
	        System.out.println("Foram digitados "+par+" n�meros pares e "+impar+" n�meros �mpares.");

	}

}
