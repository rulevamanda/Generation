programa
{
	inclua biblioteca Matematica-->math
	funcao inicio()
	{
		real s,ms,ss=0.0,maiors=0.0,p=0
		/*
		 * s = salário
		 * ms = maior salário
		 * ss = soma do salário
		 * maiors = maior salário
		 * p = percentual de pessoas com s <= 100.00
		 */
		inteiro f,sf=0,mf,h=2,x
		/*
		 * f = número de filhos
		 * sf = soma do número de filhos
		 * mf = média do número de filhos
		 * h = número de habitantes
		 */
		cadeia nome
		
		para(x=1;x<=h;x++)
		{
			escreva("\nDigite o nome do habitante: ")
			leia(nome)
			escreva("\nDigite o valor do salário do habitante ",nome,": ")
			leia(s)
			ss = ss + s
			se(maiors<s)
			{
				maiors = s
			}
			se(s<=100.0)
			{
				p = p+((h/100.0)*h)
			}
			escreva("\nDigite o número de filhos que habitante ",nome," tem: ")
			leia(f)
			
			sf = sf + f
		}

		ms = ss/h
		mf = sf/h

		escreva("\nA média do salário da população é de: ",math.arredondar(ms,2))
		escreva("\nA média do número de filhos é: ",mf)
		escreva("\nO maior salário é: ",maiors)
		escreva("\nO percentual de pessoas com salário até 100.00 é: ",p,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */