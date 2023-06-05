package atividade8POO;

public class Exercicio5Objeto {

	public static void main(String[] args) {

//		criando os objetos com o constructor
		Exercicio5Classe filme1 = new Exercicio5Classe("A Hora do Rush", "F21", 19.99f, 12.35f);
		Exercicio5Classe filme2 = new Exercicio5Classe("Avatar", "J16", 19.99f, 15.35f);
		
//		mostrando os valores com o visualizer
		filme1.visualizer();
		System.out.println("\n");
		filme2.visualizer();
	}

}
