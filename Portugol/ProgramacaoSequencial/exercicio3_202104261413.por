programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		inteiro segundos,minutos,horas,input
		
		escreva("Quantos segundos dura o evento da fábrica expressa?")
		leia(input)

		horas = (input/(60*60))
		minutos = ((input%(60*60))/60)
		segundos = ((input%(60*60)%60))

		escreva("\nO evento dura ",horas,"horas, ",minutos,"minutos e ",segundos,"segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */