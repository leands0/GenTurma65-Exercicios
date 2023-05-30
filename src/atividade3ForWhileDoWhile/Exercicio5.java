package atividade3ForWhileDoWhile;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, pos=0;
		
		do {
			System.out.println("Digite um número:");
			num = ler.nextInt();
			if(num>0) {
				pos = pos+num;
			}
		} while (num!=0);
		System.out.println("A soma dos números positivos é: "+pos);
		ler.close();
		
	}

}
