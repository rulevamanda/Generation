programa
{
	inclua biblioteca Matematica-->math
	funcao inicio()
	{
		real n1,n2,n3,m,mg,sm=0.0
		/*
		 * n = nota
		 * m = média
		 * mg = média geral
		 * sm = soma das médias
		 */
		cadeia nome
		inteiro x,p//variável de loop

		escreva("Digite o número de participantes: ")
		leia(p)

		para(x=1;x<=p;x++)//x++ é a mesma coisa que x=x+1
		{
			escreva("\nDigite o nome de participante: ")
			leia(nome)
			escreva("Digite a primeira nota: ")
			leia(n1)
			escreva("Digite a segunda nota: ")
			leia(n2)
			escreva("Digite a terceira nota: ")
			leia(n3)

			m = (n1+n2+n3)/3
			escreva("\nA média de participante ",x," (",nome,") é ",math.arredondar(m,2),".\n")

			se(m>=7 e m<=10)
			{
				escreva("\nParticipante ",nome," aprovade.\n")
			}
			senao
			{
				escreva("\nParticipante ",x," (",nome,") não foi aprovade.\n")
			}

			sm = sm+m
		}
		limpa()
		mg = sm/3

		escreva("A média geral é: ",math.arredondar(mg,2),".")
		



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */