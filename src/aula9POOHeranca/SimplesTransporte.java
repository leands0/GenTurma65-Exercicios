package aula9POOHeranca;

public class SimplesTransporte {
//	atributo da classe
	private String capacidade;

// constructor e constructor vazio
	public SimplesTransporte(String capacidade) {
		super();
		this.capacidade = capacidade;
	}
	
	public SimplesTransporte() {}

//	visualizer
	public void visualizer() {
		System.out.println("Olá! Esse é o atributo: " + this.capacidade);
	}

//	método get e set
	public String getcapacidade() {
		return capacidade;
	}

	public void setcapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

}
