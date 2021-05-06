programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		real cf,pd,i,cc
		/* cf = custo de fabrica
		 * pd = percentagem do distribuidor
		 * i = impostos
		 * cc = custo ao consumidor
		 */
		
		escreva("Qual o custo de fábrica do automóvel?")
		leia(cf)

		pd = (cf / 100) * 28
		i =  (cf / 100) * 45

		cc = cf + i + pd

		escreva("\nO custo ao consumidor é ",math.arredondar(cc,2),"$.")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */