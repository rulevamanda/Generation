package aula_202105110929;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome,String endereco,String cpf,int telefone,int idade,double valorProducao,double comissao) {
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do Empregado: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "
				+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\n"+"Valor monetário do total de atrigos produzidos por "+getNome()
				+": "+valorProducao+"\n"+"Porcentagem(sem'%') da comissão deste artigo: "+comissao);
	}
	
	public void calculaValorArtigo() {
		double valor_total = valorProducao +(valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo operário "+getNome()+" é igual a: "+valor_total);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	

}
