programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		cadeia nome
		real nota1,nota2,nota3,media
		
		escreva("Qual o nome do aluno?")
		leia(nome)
		escreva("Qual o valor da primeira nota?")
		leia(nota1)
		escreva("Qual o valor da segunda nota?")
		leia(nota2)
		escreva("Qual o valor da terceira nota?")
		leia(nota3)
		
		media = ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5)
		
		escreva("A média ponderada de ",nome," é ",math.arredondar(media, 2),".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */