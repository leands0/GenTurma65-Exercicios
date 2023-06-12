package aula9POOHeranca;

public class DependenciaCarrinho {
	// O método mostraItem do carrinho, PRECISA de um objeto da classe Produto
		public void mostraItem(DependenciaProduto produto) {
			System.out.println("Id: " + produto.getId());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco());
		}
		
		// public void adicionarItem(Produto item) {}
		
		// public void removerItem() {}
}
