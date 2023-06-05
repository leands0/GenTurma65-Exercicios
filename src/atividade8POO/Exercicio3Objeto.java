package atividade8POO;

public class Exercicio3Objeto {

	public static void main(String[] args) {
//	chamando a classe com o constructor	
		Exercicio3Classe jogo1 = new Exercicio3Classe("Skyrim", "Bethesda", 2011, 15, 50.00f);
		Exercicio3Classe jogo2 = new Exercicio3Classe("Dragon Age Inquisition", "Bioware", 2014, 10, 70.00f);

//	mostrando os valores com o método visualizer
		jogo1.visualizer();
		System.out.println("\n");
		jogo2.visualizer();
	}

}
