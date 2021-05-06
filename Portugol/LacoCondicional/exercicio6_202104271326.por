programa
{
	
	funcao inicio()
	{
		inteiro i
		
		escreva("Digite a idade de nadadore: ")
		leia(i)

		se(i>=5 e i<=7)
		{
			escreva("\nNadadore na classe Infantil A.")
		}
		
		senao se (i>=8 e i<=11)
		{
			escreva("\nNadadore na classe Infantil B.")
		}

		senao se (i>=12 e i<=13)
		{
			escreva("\nNadadore na classe Juvenil A.")
		}

		senao se (i>=14 e i<=17)
		{
			escreva("\nNadadore na classe Juvenil B.")
		}

		senao se(i>=18)
		{
			escreva("\nNadadore na classe Adultos.")
		}

		senao
		{
			escreva("\nIdade digitada não se encaixa em nenhuma classe.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */