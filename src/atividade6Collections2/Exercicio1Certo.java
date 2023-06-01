package atividade6Collections2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Certo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Queue<String> filaClientes = new LinkedList<String>();
		int escolha=0;
		String cliente;
		
		/*do while com o menu, enquanto a opção 0 não for digitada, vai completar a ação digitada
		 * e exibir o menu novamente, salvando as informações inseridas/removidas dentro desse loop
		*/
		do {System.out.println("\n\t1. Adicionar um novo cliente na Fila." + "\n\t2. Listar todos os clientes."
				+ "\n\t3. Retirar um cliente." + "\n\t0. Sair do programa.");
		System.out.println("\nDigite a opção desejada:");
		escolha = ler.nextInt();
			if(escolha == 1) {
				System.out.println("Digite o nome do cliente:");
				cliente = ler.next();
				filaClientes.add(cliente);
				System.out.println("\ncliente adicionado: "+cliente);}
			
			else if (escolha == 2) { if(!filaClientes.isEmpty()) {
				System.out.println("\nEstes são os clientes: "+filaClientes);
			}else {System.out.println("\nA fila está vazia!");
				}}
			
			else if (escolha == 3) {
				if(filaClientes.isEmpty()) {System.out.println("\nA fila já está vazia!");
			}else { System.out.println("\ncliente retirado da pilha: "+filaClientes.remove());
				}}
			
			else if (escolha == 0) {System.out.println("\nPrograma finalizado!");
			}
			
			else {System.out.println("Opção inválida!");
			
			}
		}
		while(escolha!=0);
		
		ler.close();
	}

}

