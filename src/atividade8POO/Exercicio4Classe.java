package atividade8POO;

public class Exercicio4Classe {

//	atributos da classe
	private String produto;
	private String marca;
	private int quantidade;
	private float preco;

//	constructor
	public Exercicio4Classe(String produto, String marca, int quantidade, float preco) {
		super();
		this.produto = produto;
		this.marca = marca;
		this.quantidade = quantidade;
		this.preco = preco;
	}

//	método visualizer
	public void visualizer() {
		System.out.println(this.produto);
		System.out.println(this.marca);
		System.out.println(this.quantidade);
		System.out.println(this.preco);

	}

//	métodos get e set
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
