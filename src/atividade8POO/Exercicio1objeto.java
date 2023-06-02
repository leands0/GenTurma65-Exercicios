package atividade8POO;

public class Exercicio1objeto {

	public static void main(String[] args) {
		
//		objetos instanciando a classe Exercicio1classe
		Exercicio1classe cliente1 = new Exercicio1classe("Yuri", "Dev", 24, 1.75f);
		Exercicio1classe cliente2 = new Exercicio1classe("Cecilia", "Cantora", 30, 1.70f);
		
//		métodos visualizer para ver todos os métodos construídos 
		cliente1.visualiza();
		cliente2.visualiza();
	}

}
