programa
{
	
	funcao inicio()
	{
		real P,E,M
		
		escreva("Olá, João!\nDigite quantos kilos de tomate: ")
		leia(P)

		E = (P-50)
		M = E*4

		se(P>50)
		{
			escreva("João, você trouxe ",E," kilos de tomate a mais do que o estabelecido\npelo regulamento do estado de São Paulo.\nA multa devida é de ",M,"R$.\nBoas vendas!")
		}

		senao se(P<=50)
		{
			escreva("João, você trouxe uma quantidade de tomates dentro do limite estabelecido pelo\nregulamento do estado de São Paulo.\nNão há multas a pagar.\nBoas vendas!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */