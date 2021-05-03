programa
{
	
	funcao inicio()
	{
		inteiro valor[10],media=0,quant=0,maior=0,x,soma=0
		
		para(x=0;x<10;x++)
		{
			escreva("Digite o valor rolado: ")
			leia(valor[x])

			se(maior<valor[x])
			{
				maior = valor[x]
			}
			soma = soma + valor[x]
		}

		para(x=0;x<10;x++)
		{
			se(maior == valor[x])
				{
					quant = quant++
				}
		}

		para(x=0;x<9;x++)
		{
			escreva("\nValor na posição ",x,": ",valor[x])
		}

		media = soma / 10

		escreva("\nA média aritmética dos lançamentos é: ",media)
		escreva("\nO número de ocorrências do maior valor é: ",quant)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 6, 10, 5}-{quant, 6, 28, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */