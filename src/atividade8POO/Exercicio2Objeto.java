package atividade8POO;

public class Exercicio2Objeto {

	public static void main(String[] args) {
		
//		chamando a classe e atribuindo aos funcionarios com o constructor
		Exercicio2Classe func1 = new Exercicio2Classe("Yuri", "Dev Pleno", 24, 5.000f);
		Exercicio2Classe func2 = new Exercicio2Classe("Matheus", "Dev Junior", 20, 3.000f);
		
//		mostrando os valores atribuídos com o método visualizer
		func1.visualizer();
		System.out.println("\n");
		func2.visualizer();
	}
	

}
