package aula9POOHeranca;

public class DependenciaProduto {
	private int id;
	private String nome;
	private float preco;
		
	public DependenciaProduto(int idProduto, String nomeProduto, float precoProduto) {
		this.id = idProduto;
		this.nome = nomeProduto;
		this.preco = precoProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}
