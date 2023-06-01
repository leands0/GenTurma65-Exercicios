package atividade6Collections2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1ErradoComSwitch {

	public static void main(String[] args) {
		
		/*Essa foi a primeira tentativa de fazer o exercício 1, tentei realizar com o método switch,
		 *entretanto uma vez que digitava um número a aplicação não voltava para o menu, tentei fazer
		 *com um do while, mas acabava gerando um loop infinito se pedisse para listar os clientes, e
		 *só com um while o menu nem iniciava, acabei fazendo o exercicio 2 dar certo com do while, if e else if,
		 *sem switch, daí voltei e fiz o exercício 1 da mesma forma.	
		*/
		Queue<String> clientes = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);

		int num;
		int finalizar = 0;
		String nome;

		System.out.println("\t1. Adicionar um novo Cliente na fila." + "\n\t2. Listar todos os Clientes na fila."
				+ "\n\t3. Retirar uma pessoa da fila." + "\n\t0. Sair do programa.");
		System.out.println("\nDigite a opção desejada:");
		num = ler.nextInt();

		switch (num) {
		case 1:
			System.out.println("Digite o nome do novo Cliente:");
			nome = ler.next();
			clientes.add(nome);
			System.out.println("Nome " + nome + " adicionado!");
			break;

		case 2:
			System.out.println("Clientes na fila: " + clientes);
			break;

		case 3:
			if (clientes.isEmpty()) {
				System.out.println("A fila já está vazia!");
			} else {
				System.out.println("Cliente retirado da fila!" + clientes.remove());
			}
			break;
		case 0: System.out.println("Programa Finalizado!");
				finalizar = 1;
			break;
		default: System.out.println("Opção Inválida!");
		
		}

	}
}
