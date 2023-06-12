package aula9POOHeranca;

import java.util.Scanner;

public class ExtraTeste {

	public static void main(String[] args) {
		ExtraCadastro cad = new ExtraCadastro();
		ExtraCadastro cad1 = new ExtraCadastro("Júlia", 18);
		ExtraCadastro cad2 = new ExtraCadastro("Laura", "Designer", 25,"Foto", "Musculação");
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o nome do Visitante: ");
		cad.setNome(leia.nextLine());
		
		System.out.println("Insira a idade do Visitante: ");
		cad.setIdade(leia.nextInt());
		
		cad.visualizar();
		cad1.visualizar();
		cad2.visualizar();
		
		leia.close();

	}

}
