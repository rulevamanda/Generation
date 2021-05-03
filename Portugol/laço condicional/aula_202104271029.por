programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		real n1,n2,n3,media
		cadeia nome
		
		escreva("Digite o nome de participante: ")
		leia(nome)
		escreva("Digite a primeira nota: ")
		leia(n1)
		escreva("Digite a segunda nota: ")
		leia(n2)
		escreva("Digite a terceira nota: ")
		leia(n3)

		media = (n1 + n2 + n3)/3

		escreva("A média aritmética é de: ",math.arredondar(media,2),".")

		se(media>=7 e media<=10)
		{
			escreva("\n",nome," foi aprovade.")
		}

		senao se(media>=0 e media<7)
		{
			escreva("\n",nome," não foi aprovade.")
		}

		senao
		{
			escreva("\nFavor verificar os valores.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */