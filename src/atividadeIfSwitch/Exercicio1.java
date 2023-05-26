package atividadeIfSwitch;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, soma;
		
		System.out.println("Digite o número A:");
		a = ler.nextInt();
		
		System.out.println("Digite o número B:");
		b = ler.nextInt();
		
		System.out.println("Digite o número C:");
		c = ler.nextInt();
		
		soma = a + b;
		
		if(soma>c) {
			System.out.println("A soma de A+B é Maior do que C");
		} else if (soma<c) {
			System.out.println("A soma de A+B é Menor do que C");
		} else {
			System.out.println("A soma de A+B é igual a C");
		}
		
		ler.close();
	}

}
