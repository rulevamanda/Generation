programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		inteiro dias,anos,meses,dia
		
		
		escreva("Quantos dias de vida você tem?")
		leia(dias)

		anos = (dias/365)
		meses = (dias%365)/30
		dia = (dias%365)%30
	
		escreva ("\nVocê tem ",anos," anos, ",meses," meses, e ",dia," dias de vida.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */