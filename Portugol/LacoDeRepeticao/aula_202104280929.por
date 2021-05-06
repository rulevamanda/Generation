programa
{
	inclua biblioteca Matematica-->math
	funcao inicio()
	{
		inteiro valor,somavalor=0,cont=1
		
		faca
		{
			escreva("\nDigite um valor: ")
			leia(valor)

			se(valor%2==0)
			{
				somavalor = somavalor + valor
			}
			senao
			{
				valor = math.potencia(valor,2)
				escreva("Potência: ",valor,"\n")
			}
			cont++//mesma coisa que cont = cont + 1
		}
		enquanto(cont<=5)

		escreva("\nSomatório dos números pares: ",somavalor,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */