package atividade3ForWhileDoWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, contador;
		
		System.out.println("Digite 2 números inteiros, o primeiro maior e o segundo menor:");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		
		if(num1<num2) {
			for(contador = num1; contador <= num2; contador++) {
				if(contador%3==0 && contador%5==0 && contador!=0) {
					System.out.println(contador+" é múltiplo de 3 e 5.");
				}
			}
		}else {
			System.out.println("Intervalo inválido!");
		}
		leia.close();
	}

}
