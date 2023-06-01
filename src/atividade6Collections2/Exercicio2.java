package atividade6Collections2;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<String>();
		int escolha=0;
		String livro;

		/*do while com o menu, enquanto a opção 0 não for digitada, vai completar a ação digitada
		 * e exibir o menu novamente, salvando as informações inseridas/removidas dentro desse loop
		*/
		do {System.out.println("\n\t1. Adicionar um novo Livro na Pilha." + "\n\t2. Listar todos os Livros."
				+ "\n\t3. Retirar um livro." + "\n\t0. Sair do programa.");
		System.out.println("\nDigite a opção desejada:");
		escolha = ler.nextInt();
			if(escolha == 1) {
				System.out.println("Digite o nome do livro:");
				livro = ler.next();
				System.out.println("\nLivro adicionado: "+pilhaLivros.push(livro));}
			
			else if (escolha == 2) { if(!pilhaLivros.isEmpty()) {
				System.out.println("\nEstes são os livros: "+pilhaLivros);
			}else {System.out.println("\nA pilha está vazia!");
				}}
			
			else if (escolha == 3) {
				if(pilhaLivros.isEmpty()) {System.out.println("\nA pilha já está vazia!");
			}else { System.out.println("\nLivro retirado da pilha: "+pilhaLivros.pop());
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

