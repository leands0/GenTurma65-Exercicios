package atividade2IfSwitch;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		float numero1, numero2, resultado;
		int codigo;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		numero1 = ler.nextFloat();

		System.out.println("Digite o segundo número:");
		numero2 = ler.nextFloat();

		System.out.println("Digite o código da operação matemática:");
		codigo = ler.nextInt();

		switch (codigo) {
		case 1:
			resultado = numero1 + numero2;
			System.out.printf("O resultado da soma é: %.2f", resultado);
			break;

		case 2:
			resultado = numero1 - numero2;
			System.out.printf("O resultado da subtração é: %.2f", resultado);
			break;

		case 3:
			resultado = numero1 * numero2;
			System.out.printf("O resultado da multiplicação é: %.2f", resultado);
			break;

		case 4:
			resultado = numero1 / numero2;
			System.out.printf("O resultado da divisão é: %.2f", resultado);
			break;

		default:
			System.out.println("Operação inválida!");
		}
		
		ler.close();
	}
}
