programa
{
	inclua biblioteca Matematica-->math
	funcao inicio()
	{
		real N1[4][6],N2[4][6],M1[4][6],M2[4][6]
		inteiro l,c
		
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("\nDigite um valor para a posição ",l,",",c," da matriz N1: ")
				leia(N1[l][c])
			}
		}

		escreva("\nA matriz N1 é:\n")
		
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("[",N1[l][c],"]")
			}
			escreva("\n")
		}

		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("\nDigite um valor para a posição ",l,",",c," da matriz N2: : ")
				leia(N2[l][c])
			}
		}

		escreva("\nA matriz N2 é:\n")
		
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("[",N2[l][c],"]")
			}
			escreva("\n")
		}

		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				(M1[l][c]) = (N1[l][c]) + (N2[l][c])
			}
		}

		escreva("\nA matriz M1 é a soma das matrizes N1 e N2:\n")
		
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("[",M1[l][c],"]")
			}
			escreva("\n")
		}
		
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				(M2[l][c]) = (N1[l][c]) / (N2[l][c])
			}
		}

		escreva("\nA matriz M2 é a diferença entre as matrizes N1 e N2:\n")
		
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("[",math.arredondar(M2[l][c],2),"]")
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
 * @POSICAO-CURSOR = 1298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 6, 7, 2}-{N2, 6, 16, 2}-{M1, 6, 25, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */