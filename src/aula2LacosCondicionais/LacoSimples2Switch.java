package aula2LacosCondicionais;

import java.util.Scanner;

public class LacoSimples2Switch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Boolean persistencia = false;
		int opcao;

		System.out.println("Digite 1 para verificar sua persistência ou 2 para sair:");
		opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Se você estiver tendo persistência digite -true- e caso não esteja digite -false-");
			persistencia = ler.nextBoolean();

			if (persistencia != true) {
				System.out.println("Por falta de persistência você não conseguiu se formar!");
			} else {
				System.out.println("Por demonstrar muita persistência você conseguiu se formar!");
			}

			break;

		case 2:
			System.out.println("Volte sempre!");
			break;
		default: System.out.println("Opção inválida!");
		}
		
		ler.close();

	}

}
