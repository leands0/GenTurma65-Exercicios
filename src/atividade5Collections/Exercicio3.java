package atividade5Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		
//		Inserir os valores digitados pelo usuário na lista
		
		for(int i=0;i<10;i++) {
		System.out.println("Digite 10 valores inteiros não repetidos:");
		setNumeros.add(ler.nextInt());
		}
		
//		Atrelar o iterator ao set e percorrer a lista printando o próximo número
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		System.out.println("Listar dados do Set:\n");
		while(isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
		
		ler.close();
		
	
	}

}
