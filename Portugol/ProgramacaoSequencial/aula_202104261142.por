programa
{
	inclua biblioteca Matematica-->Math
	funcao inicio()
	{
		inteiro idade
		real altura,nota1,nota2,nota3,media,pot,raiz
		/*não utilizar vírgula, usar ponto para a entrada de dados
		 * pot = potencia
		 */
		cadeia nome

		//Neste momento começaremos a fazer a interação com o nosso usuário.

		escreva("Digite o seu nome:")//saída de dados
		leia(nome)//entrada de dados
		escreva("Digite a sua idade:")
		leia(idade)
		escreva("Digite a sua altura:")
		leia(altura)

		escreva("Digite a primeira nota:")
		leia(nota1)
		escreva("Digite a segunda nota:")
		leia(nota2)
		escreva("Digite a terceira nota:")
		leia(nota3)

		media = (nota1+nota2+nota3)/3

		escreva("\nSeu nome é ",nome,", sua idade é ",idade,", e sua altura é ",altura)
		escreva("\nA média do participante é: ",Math.arredondar(media,2))
		
		pot = Math.potencia(nota1, 3.0)
		raiz = Math.raiz(nota2, 2.0)

		escreva("\nO valor ao cubo da primeira nota é: ",pot)
		escreva("\nO valor da raiz quadrada da segunda nota é: ",raiz)
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1006; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */