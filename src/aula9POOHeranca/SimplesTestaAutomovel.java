package aula9POOHeranca;

public class SimplesTestaAutomovel {

	public static void main(String[] args) {
		SimplesAutomovel carro = new SimplesAutomovel("5 pessoas", 4, 80f, "Vermelho", 4, "GEN6523", 3);
		SimplesAutomovel carro2 = new SimplesAutomovel();
		
		carro.setcapacidade("4 pessoas");
		carro.visualizer();
		carro2.visualizer();
	}

}
