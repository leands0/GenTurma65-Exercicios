package atividade2IfSwitch;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int item, qtd;
		float preco, total;

		System.out.println("Digite um número de 1 a 6 para escolher o produto:");
		item = ler.nextInt();

		System.out.println("Digite a quantidade desejada:");
		qtd = ler.nextInt();

		switch (item) {
		case 1:
			preco = 10.00f;
			total = qtd * preco;
			System.out.printf("O produto é Cachorro Quente e o total é: %.2f", total);
			break;

		case 2:
			preco = 15.00f;
			total = qtd * preco;
			System.out.printf("O produto é X-Salada e o total é: %.2f", total);
			break;

		case 3:
			preco = 18.00f;
			total = qtd * preco;
			System.out.printf("O produto é X-Bacon e o total é: %.2f", total);
			break;

		case 4:
			preco = 12.00f;
			total = qtd * preco;
			System.out.printf("O produto é Bauru e o total é: %.2f", total);
			break;

		case 5:
			preco = 8.00f;
			total = qtd * preco;
			System.out.printf("O produto é Refrigerante e o total é: %.2f", total);
			break;

		case 6:
			preco = 13.00f;
			total = qtd * preco;
			System.out.printf("O produto é Suco de Laranja e o total é: %.2f", total);
			break;

		default:
			System.out.println("Opção inválida!");
		}

		ler.close();

	}

}
