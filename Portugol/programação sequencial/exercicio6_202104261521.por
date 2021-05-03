programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		real x1,y1,x2,y2,a,b,d
		
		escreva("Qual o valor de x1?")
		leia(x1)
		escreva("Qual o valor de y1?")
		leia(y1)
		escreva("Qual o valor de x2?")
		leia(x2)
		escreva("Qual o valor de y2?")
		leia(y2)

		a = (math.potencia((x2-x1),2.0))
		b = (math.potencia((y2-y1),2.0))

		d = (math.raiz((a+b), 2.0))

		escreva("\nA distância entre os dois pontos é ",math.arredondar(d,2),".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */