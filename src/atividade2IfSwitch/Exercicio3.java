package atividade2IfSwitch;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		boolean doacao = false;
		
		System.out.println("Qual o nome da pessoa doadora?");
		nome = ler.next();
		
		System.out.println("Qual a idade?");
		idade = ler.nextInt();
		
		System.out.println("É a primeira doação de sangue?");
		doacao = ler.nextBoolean();
		
		if(idade<18) {
			System.out.println(nome+" não pode doar sangue!");
		}else if(idade>=18 && idade<60) {
			System.out.println(nome+" pode doar sangue!");
		}else if(idade>=60) {
			if (idade<=69 && doacao == true) {
				System.out.println(nome+" não pode doar sangue!");
			}else if (idade<=69 && doacao==false){
				System.out.println(nome+" pode doar sangue!");
			}else {
				System.out.println(nome+" não pode doar sangue!");
			}
		}
		ler.close();
	}

}
