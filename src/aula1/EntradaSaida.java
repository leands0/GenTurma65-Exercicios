package aula1;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		float distancia;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a distância percorrida: ");
		distancia = leia.nextFloat();
		
		System.out.println("\nParabéns " + nome + ","
				+ " a sua distância percorrida foi de " + distancia + "Km");
		
	}

}
