programa
{
	inclua biblioteca Matematica-->math
	funcao inicio()
	{
		inteiro N,R
		
		escreva("Digite um número: ")
		leia(N)

		R = (N%2)//resto
		
		se (R==0)//usar dois iguais (==) para comparação
		{
			escreva("\nO número ",N," é PAR.")
		}

		senao
		{
			escreva("\nO número ",N," é ÍMPAR.")
		}

		se(N>0)
		{
			escreva("\nO número ",N," é POSITIVO.")
		}

		senao se(N==0)
		{
			escreva("\nO número ",N," é NULO.")
		}

		senao
		{
			escreva("\nO número ",N," é NEGATIVO.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */