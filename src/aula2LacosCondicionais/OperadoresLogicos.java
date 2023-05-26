package aula2LacosCondicionais;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int proat, trab;
		
		System.out.println("Digite sua nota de proatividade:");
		proat = ler.nextInt();
		
		System.out.println("Digite sua nota de trabalho em equipe:");
		trab = ler.nextInt();
		
//		System.out.println("\nÉ preciso ter duas notas 4: ");
//		if (proat == 4 && trab == 4) {
//			System.out.println("Parabéns! Duas notas 4!!");
//		} else {
//			System.out.println("Sinto muito, você não possui duas notas 4!");
//		}
		
		System.out.println("\nÉ preciso ter pelo menos uma nota 4: ");
		if (proat == 4 || trab == 4) {
			System.out.println("Parabéns! Você obteve pelo menos uma nota 4!!");
		} else {
			System.out.println("Sinto muito, você não possui nenhuma nota 4!");
		}
	
		ler.close();
	}

}
