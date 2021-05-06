programa
{
	
	funcao inicio()
	{
		inteiro pontos[4],maiorp=0,x

		para(x=0;x<4;x++)
		{
			escreva("\nDigite o valor dos pontos: ")
			leia(pontos[x])

			se(maiorp < pontos[x])
			{
				maiorp = pontos[x]
			}
		}

		para(x=0;x<4;x++)
		{
			escreva("\nValor na posição ",x,": ",pontos[x])
		}

		escreva("\nA maior pontuação é: ",maiorp)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 6, 10, 6}-{maiorp, 6, 20, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */