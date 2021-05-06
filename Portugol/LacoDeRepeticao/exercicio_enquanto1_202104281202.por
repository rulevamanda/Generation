programa
{
	
	funcao inicio()
	{
		real num,media,total=0.0
		inteiro cont=0

		escreva("\nDigite um número: ")
		leia(num)

		enquanto(num>0)
		{
			total = total + num
			
			cont++
			
			escreva("\nDigite um número: ")
			leia(num)
		}

		media = total/cont
		
		escreva("\nA soma dos números é:",total)
		escreva("\nA média dos números é: ",media)
		escreva("\nForam lidos ",cont," números.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */