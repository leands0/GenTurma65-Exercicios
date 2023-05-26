package atividadeIfSwitch;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String a, b, c;

		System.out.println("O animal escolhido é vertebrado ou invertebrado?");
		a = ler.next();

		if (a.equalsIgnoreCase("Vertebrado")) {
			System.out.println("O animal é uma ave ou mamífero?");
			b = ler.next();
			if (b.equalsIgnoreCase("Ave")) {
				System.out.println("O animal é carnívoro ou onívoro?");
				c = ler.next();
				if (c.equalsIgnoreCase("Carnívoro")) {
					System.out.println("O animal é uma Águia!");
				} else if (c.equalsIgnoreCase("Onívoro")) {
					System.out.println("O animal é uma Pomba!");
				} else {
					System.out.println("Resposta inválida!");
				}
			} else if (b.equalsIgnoreCase("Mamífero")) {
				System.out.println("O animal é onívoro ou herbívoro?");
				c = ler.next();
				if (c.equalsIgnoreCase("Onívoro")) {
					System.out.println("O animal é um Ser Humano!");
				} else if (c.equalsIgnoreCase("Herbívoro")) {
					System.out.println("O animal é uma Vaca!");
				} else {
					System.out.println("Resposta inválida!");
				}

			} else {
				System.out.println("Resposta inválida!");
			}

		} else if (a.equalsIgnoreCase("Invertebrado")) {
			System.out.println("O animal é um Inseto ou Anelídeo?");
			b = ler.next();
			if (b.equalsIgnoreCase("Inseto")) {
				System.out.println("O animal é Hematófogo ou Herbívoro?");
				c = ler.next();
				if (c.equalsIgnoreCase("Hematófogo")) {
					System.out.println("O animal é uma Pulga!");
				} else if (c.equalsIgnoreCase("Herbívoro")) {
					System.out.println("O animal é uma Lagarta!");
				} else {
					System.out.println("Resposta inválida!");
				}
			} else if (b.equalsIgnoreCase("Anelídeo")) {
				System.out.println("O animal é Hematófogo ou Onívoro?");
				c = ler.next();
				if (c.equalsIgnoreCase("Hematófogo")) {
					System.out.println("O animal é uma Sanguessuga!");
				} else if (c.equalsIgnoreCase("Onívoro")) {
					System.out.println("O animal é uma Minhoca!");
				} else {
					System.out.println("Resposta inválida!");
				}

			} else {
				System.out.println("Resposta inválida!");
			}
		} else {
			System.out.println("Resposta inválida!");
		}
		ler.close();
	}

}
