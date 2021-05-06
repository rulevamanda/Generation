programa
{
	
	funcao inicio()
	{
		inteiro C
		real N,S,E

		S = 10.0
		
		escreva("Digite o código do operário: ")
		leia(C)
		escreva("Digite quantas horas o operário trabalhou: ")
		leia(N)

		E = (N-50)*20

		se(N>50)
		{
			escreva("O operário ",C," é devido ",(50*10),"R$, MAIS o excedente de ",E,"R$, totalizando ",(50*10)+E,"R$.")
		}

		senao se(N<=50)
		{
			escreva("O operário ",C," é devido ",(50*10),"R$.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */