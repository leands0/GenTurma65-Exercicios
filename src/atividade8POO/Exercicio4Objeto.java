package atividade8POO;

public class Exercicio4Objeto {

	public static void main(String[] args) {
//		chamando a classe com o constructor para atribuir os valores nas variáveis
		Exercicio4Classe p1 = new Exercicio4Classe("Pastilha para garganta", "Strepsils", 50, 14.99f);
		Exercicio4Classe p2 = new Exercicio4Classe("Shake de proteínas", "Yopro", 20, 9.99f);

//		método visualizer para mostrar no console
		p1.visualizer();
		System.out.println("\n");
		p2.visualizer();
	}

}
