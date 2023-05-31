package atividade5Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> num= new ArrayList<Integer>();
		int numero;
		
//		adicionar os 10 valores inteiros na lista
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
//		Pegar o valor digitado pelo usuário e armazenar na variável "numero"
		System.out.println("Digite um número inteiro para ser encontrado na lista:");
		numero = ler.nextInt();
		
//		If para verificar se a lista contém o valor digitado
		
		if(num.contains(numero)) {
		System.out.println("O número "+numero+" está localizado na posição: "+num.indexOf(numero));
		}else {
			System.out.println("O número "+numero+" não foi encontrado!");
		}
		
		ler.close();
	}

}
