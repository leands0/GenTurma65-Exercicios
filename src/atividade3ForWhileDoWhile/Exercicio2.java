package atividade3ForWhileDoWhile;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, par = 0, impar = 0, contador;
		
		for(contador=1;contador<=10;contador++) {
			System.out.println("Digite o "+contador+"º número");
			num = ler.nextInt();
			if(num%2==0) {
				par += 1;
			}else {impar += 1;
			}
		}
		System.out.println("Total de números pares:"+par);
		System.out.println("Total de números ímpares:"+impar);
		ler.close();
	}

}
