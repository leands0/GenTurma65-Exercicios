package atividadeVarOpe;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o Salário:");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Esse é o Novo Salário:" + novoSalario);
		
		leia.close();
	}

}
