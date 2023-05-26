package atividade3ForWhileDoWhile;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, soma=0, contador=0;
		float media;
		
		
		do {System.out.println("Digite um número:");
		num = leia.nextInt();
		if(num%3==0 && num!=0) {
			soma = soma+ num;
			contador++;
		}
		}while(num!=0);
		System.out.println(soma);
		System.out.println(contador);
		media = soma/contador;
		System.out.println("A média de todos os números múltiplos de 3 é: "+ media);
		leia.close();
	}

}
