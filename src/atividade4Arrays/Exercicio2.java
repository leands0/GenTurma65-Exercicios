package atividade4Arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];
		int par, impar, soma = 0, i;
		float media;

//		inserir os número digitados no vetor
		
		for (i=0; i<vetor.length;i++) {
			System.out.println("Digite o "+(i+1)+"º valor:");
			vetor[i] = ler.nextInt();
		}

//		printar os elementos que estão nos índices ímpares
		
		for(i=1;i<vetor.length;i+=2) {
			System.out.println("Os elementos nos índices ímpares são: "+vetor[i]);
		}
		
//		printar os elementos que são pares
		
		for(i=0;i<vetor.length;i++) {
			if (vetor[i]%2==0) {
				System.out.println("Os elementos pares são: "+vetor[i]);
			}
		}
		
//		printar a soma de todos os elementos do vetor
		
		for(i=0;i<vetor.length;i++) {
			soma+=vetor[i];
		}
		System.out.println("\nA soma é: "+soma);

//		printar a média de todos os elementos do vetor
//		por que ta dando 5 e não 5.5? ta fazendo a media errado
		
		media = soma/10;
		System.out.println("\nA média é: "+ media);

	}

}
