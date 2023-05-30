package atividade4Arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double matrizMedias[][] = new double[10][4];
		double medias[] = new double[10];
		double soma = 0;
		Scanner leia = new Scanner(System.in);

		for (int indiceLinha = 0; indiceLinha < matrizMedias.length; indiceLinha++) {
			for (int indiceColuna = 0; indiceColuna < matrizMedias[indiceLinha].length; indiceColuna++) {
				System.out.println("Digite a " + (indiceColuna + 1) + "º nota do "+(indiceLinha+1)+"º estudante:");
				matrizMedias[indiceLinha][indiceColuna]= leia.nextFloat();
			}
		}
		
		for (int indiceLinha = 0; indiceLinha < matrizMedias.length; indiceLinha++) {
			soma = 0;
			for (int indiceColuna = 0; indiceColuna < matrizMedias[indiceLinha].length; indiceColuna++) {
			soma+=matrizMedias[indiceLinha][indiceColuna];
			}
			medias[indiceLinha]=soma/4;
		}
		
		System.out.println("\nMédias:");
		for(int indiceLinha = 0;indiceLinha<10;indiceLinha++) {
			System.out.printf("\nAluno "+indiceLinha+": %.1f", medias[indiceLinha]);
		}
	}

}
