programa
{
	
	funcao inicio()
	{
		real M[3][3],soma=0,somadiagonal=0
		inteiro l,c

		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("Digite o valor da posição ",l,",",c,": ")
				leia(M[l][c])

				soma = soma + (M[l][c])
			}

		}

		escreva("\nA matriz é:\n")
		
		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("[",M[l][c],"]")
			}
			escreva("\n")
		}

		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				se (l == c)
				{
					somadiagonal = somadiagonal + (M[l][c])
				}
			}
		}
		
		escreva("\nA soma dos valores da matriz é: ",soma)
		escreva("\nA soma dos valores da diagonal principal é: ",somadiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */