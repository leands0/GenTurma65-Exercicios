package atividadeIfSwitch;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome, cargo;
		int codigo;
		float salario, novosalario, reajuste;
		
		System.out.println("Insira o nome da pessoa colaboradora:");
		nome = ler.nextLine();
		
		System.out.println("Insira o código da pessoa colaboradora:");
		codigo = ler.nextInt();
		
		System.out.println("Insira o salário da pessoa colaboradora:");
		salario = ler.nextFloat();
		
		switch(codigo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.1f;
			novosalario = salario + (reajuste*salario);
			System.out.println("A pessoa colaboradora é: "+nome);
			System.out.println("O cargo é: "+cargo);
			System.out.printf("O novo salário é: R$%.2f",novosalario);
			break;
		
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			novosalario = salario + (reajuste*salario);
			System.out.println("A pessoa colaboradora é: "+nome);
			System.out.println("O cargo é: "+cargo);
			System.out.printf("O novo salário é: R$%.2f",novosalario);
			break;
		
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			novosalario = salario + (reajuste*salario);
			System.out.println("A pessoa colaboradora é: "+nome);
			System.out.println("O cargo é: "+cargo);
			System.out.printf("O novo salário é: R$%.2f",novosalario);
			break;
			
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			novosalario = salario + (reajuste*salario);
			System.out.println("A pessoa colaboradora é: "+nome);
			System.out.println("O cargo é: "+cargo);
			System.out.printf("O novo salário é: R$%.2f",novosalario);
			break;
			
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			novosalario = salario + (reajuste*salario);
			System.out.println("A pessoa colaboradora é: "+nome);
			System.out.println("O cargo é: "+cargo);
			System.out.printf("O novo salário é: R$%.2f",novosalario);
			break;
			
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			novosalario = salario + (reajuste*salario);
			System.out.println("A pessoa colaboradora é: "+nome);
			System.out.println("O cargo é: "+cargo);
			System.out.printf("O novo salário é: R$%.2f",novosalario);
			break;
			
			default: System.out.println("Cargo inválido!");		
		}
		
		ler.close();
		
	}

}
