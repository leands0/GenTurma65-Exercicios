package atividade8POO;

public class Exercicio3Classe {
//	variáveis da classe
	private String nome;
	private String desenvolvedora;
	private int lancamento;
	private int quantidade;
	private float preco;

//	método constructor
	public Exercicio3Classe(String nome, String desenvolvedora, int lancamento, int quantidade, float preco) {
		this.nome = nome;
		this.desenvolvedora = desenvolvedora;
		this.lancamento = lancamento;
		this.quantidade = quantidade;
		this.preco = preco;
	}

//	método visualizer
	public void visualizer() {
		System.out.println(this.nome);
		System.out.println(this.desenvolvedora);
		System.out.println(this.lancamento);
		System.out.println(this.quantidade);
		System.out.println(this.preco);
	}

//	métodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public int getLancamento() {
		return lancamento;
	}

	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
