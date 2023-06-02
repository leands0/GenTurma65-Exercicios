package aula7Metodos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextFloat();
		
		//Exibe o resultado de cada operação matemática
		
		System.out.println("Soma = "+soma(num1, num2));
		System.out.println("Subtração = "+subtracao(num1, num2));
		System.out.println("Multiplicação = "+multiplicacao(num1, num2));
		System.out.println("Divisão = "+divisao(num1, num2));
		
		//Executa o método void turma()
		turma();
		
		//Executa o método float soma() com valores inseridos de forma direta
		System.out.println("\nSoma de valores inseridos de forma dreta = "+soma(5.0f, 10.0f));
		
		//Finaliza o objeto ler
		ler.close();
	}

	//Método soma com 2 parâmetros float
	public static float soma (float num1, float num2) {
		return num1 + num2;
	}

	//Método subtração com 2 parâmetros float
	public static float subtracao (float num1, float num2) {
		return num1 - num2;
	}
	
	//Método multiplicação com 2 parâmetros float
	public static float multiplicacao (float num1, float num2) {
		return num1 * num2;
	}
	
	//Método divisão com 2 parâmetros float
	public static float divisao (float num1, float num2) {
		return num1 / num2;
	}
	
	//Método turma() do tipo void, ou seja, sem retorno
	public static void turma() {
		System.out.println("\nCalculadora da Turma!!!");
	}
}


