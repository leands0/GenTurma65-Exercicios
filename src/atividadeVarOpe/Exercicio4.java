package atividadeVarOpe;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número 1:");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o número 2:");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o número 3:");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite o número 4:");
		numero4 = leia.nextFloat();
		
		diferenca = ((numero1*numero2)-(numero3*numero4));
		System.out.printf("Essa é a diferença: %.1f", diferenca);
		
//		System.out.println("\nDigite o número 1:");
//		numero1 = leia.nextFloat();
//		
//		System.out.println("Digite o número 2:");
//		numero2 = leia.nextFloat();
//		
//		System.out.println("Digite o número 3:");
//		numero3 = leia.nextFloat();
//		
//		System.out.println("Digite o número 4:");
//		numero4 = leia.nextFloat();
//		
//		diferenca = ((numero1*numero2)-(numero3*numero4));
//		System.out.printf("Essa é a diferença: %.1f", diferenca);
		
	}

}
