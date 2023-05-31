package atividade5Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		
//		Loop para o usuario adicionar as cores na lista pelo console
		for(int i=0;i<5;i++) {
			System.out.println("Digite 5 cores:");
			cores.add(ler.next());
		}

		System.out.println("Essas são as cores digitadas:"+cores);
		
//		Método sort para ordenar a lista
		Collections.sort(cores);
	
		System.out.println("Essas são as cores em ordem crescente:"+cores);
	
		ler.close();
	}

}
