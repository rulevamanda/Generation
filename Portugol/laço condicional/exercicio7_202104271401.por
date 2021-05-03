programa
{
	
	funcao inicio()
	{
		real b,h,a
		
		escreva("Digite o valor da base do triângulo: ")
		leia(b)
		escreva("Digite o valor da altura do triângulo: ")
		leia(h)
		
		a = b*h

		se (b>0 e h>0)
		{
			escreva("\nA área do triângulo é ",a,".")
		}

		senao
		{
			escreva("\nNúmeros inválidos.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */