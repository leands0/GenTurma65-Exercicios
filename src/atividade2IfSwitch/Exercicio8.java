package atividade2IfSwitch;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int codigo;
		float saldo = 1000.00f, saque, deposito, novosaldo;

		System.out.println("Digite a operação desejada:\n1. Saldo\n2. Saque\n3. Depósito");
		codigo = ler.nextInt();

		switch (codigo) {
		case 1:
			System.out.printf("O saldo é de: %.2f", saldo);
			break;

		case 2:
				System.out.println("Insira o valor a ser sacado:");
				saque = ler.nextFloat();
				novosaldo = saldo - saque;
				if (novosaldo>0) {
				System.out.printf("O saldo é de: %.2f", novosaldo);
			} else {
				System.out.println("Você não tem saldo disponível!");
			}
			break;

		case 3:
			System.out.println("Insira o valor a ser depositado:");
			deposito = ler.nextFloat();
			novosaldo = saldo + deposito;
			System.out.printf("O saldo é de: %.2f", novosaldo);
			break;
			
		default: System.out.println("Operação Inválida!");
		}
		
		ler.close();
	}

}
