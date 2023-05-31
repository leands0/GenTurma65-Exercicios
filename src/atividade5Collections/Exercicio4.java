package atividade5Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		int num;
		
//		iniciando os valores na lista
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
//		pedindo pro usuario digitar um numero inteiro
		System.out.println("Digite um valor inteiro para verificar se tem na lista:");
		num = ler.nextInt();
		
//		verificando se o numero digitado existe na lista e printando o resultado
		
		if(setNumeros.contains(num)) {
			System.out.println("O número "+num+" foi encontrado!");
		}else{System.out.println("O número "+num+" não foi encontrado!");}

		ler.close();
	}

}
