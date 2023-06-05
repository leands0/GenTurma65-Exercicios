package atividade8POO;

public class Exercicio6Objeto {

	public static void main(String[] args) {
//		criando os objetos com o constructor
		Exercicio6Classe curso1 = new Exercicio6Classe("Python para iniciantes", "3 meses", 40, 2000f);
		Exercicio6Classe curso2 = new Exercicio6Classe("Java Fullstack", "4 meses", 45, 3000f);

//		mostrando os valores com o visualizer
		curso1.visualizer();
		System.out.println("\n");
		curso2.visualizer();
	}

}
