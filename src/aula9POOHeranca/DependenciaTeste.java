package aula9POOHeranca;

public class DependenciaTeste {

	public static void main(String[] args) {
		// Crio um objeto de produto, e um objeto de carrinho
				DependenciaProduto prod = new DependenciaProduto(1, "Café", 14.50f);
				DependenciaCarrinho car = new DependenciaCarrinho();
				
				// Passo o produto para o carrinho
				car.mostraItem(prod);

			}


	}

