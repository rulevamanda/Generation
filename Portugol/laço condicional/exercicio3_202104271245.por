programa
{
	inclua biblioteca Matematica-->math
	funcao inicio()
	{
		real n1,n2,n3,n4,q1,q2,q3,q4
		
		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terceiro número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)

		q1 = math.potencia(n1,2.0)
		q2 = math.potencia(n2,2.0)
		q3 = math.potencia(n3,2.0)
		q4 = math.potencia(n4,2.0)

		se(q3>=1000)
		{
			escreva("\nO valor quadrado do terceiro número é ",q3,".")
		}

		senao
		{
			escreva("\nO valor quadrado do primeiro número é ",q1,".")
			escreva("\nO valor quadrado do segundo número é ",q2,".")
			escreva("\nO valor quadrado do terceiro número é ",q3,".")
			escreva("\nO valor quadrado do quarto número é ",q4,".")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 749; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */