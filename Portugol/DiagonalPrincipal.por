programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		// Define as dimensões (linhas e colunas) da matriz
		const inteiro TAMANHO = 5

		// Cria a matriz
		caracter matriz[TAMANHO][TAMANHO] 

		preenche(matriz)
		exibe(matriz)
	}

	// Preenche a diagonal principal da matriz
	funcao preenche(caracter &matriz[][])
	{
		para (inteiro linha = 0; linha < u.numero_linhas(matriz); linha++)
		{
			para (inteiro coluna = 0; coluna < u.numero_colunas(matriz); coluna++)
			{
				se (linha == coluna)
				{
					matriz[linha][coluna] = '*'
				}
				senao
				{
					matriz[linha][coluna] = ' '
				}
			}
		}		
	}

	// Percorre e exibe a matriz
	funcao exibe(caracter matriz[][])
	{
		para (inteiro linha = 0; linha < u.numero_linhas(matriz); linha++)
		{
			para (inteiro coluna = 0; coluna < u.numero_colunas(matriz); coluna++)
			{
				escreva("[", matriz[linha][coluna], "]")
			}
			
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */