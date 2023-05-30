package atividade4Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[]= {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int i, num, resultado = -1;
		
		System.out.println("Digite o número que você deseja encontrar:");
		num = leia.nextInt();
		
		for(i=0; i<vetor.length; i++) {
			if (num == vetor[i]) {
				resultado = i;
				}
		}
		if(resultado!=-1) {
				System.out.println("O número "+num+" foi encontrado na posição " + resultado);	
		} else {System.out.println("O número "+num+" não foi encontrado!");}
	}

}
