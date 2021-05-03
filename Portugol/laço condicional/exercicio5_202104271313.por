programa
{
	
	funcao inicio()
	{
		real i
		
		escreva("Digite o valor do índice de poluição: ")
		leia(i)

		se(i<=0.25)
		{
			escreva("\nO valor do índice de poluição está aceitável.")
		}

		senao se(i>0.25 e i<=0.3)
		{
			escreva("\nInsústrias do Grupo 1, suspendam suas atividades.")
		}

		senao se(i>0.3 e i<=0.4)
		{
			escreva("\nInsústrias do Grupo 1, suspendam suas atividades.\nInsústrias do Grupo 2, suspendam suas atividades.")
		}

		senao se(i>0.4)
		{
			escreva("\nInsústrias do Grupo 1, suspendam suas atividades.\nInsústrias do Grupo 2, suspendam suas atividades.\nInsústrias do Grupo 3, suspendam suas atividades.")
		}


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 647; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */