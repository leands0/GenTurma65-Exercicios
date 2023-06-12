package aula9POOHeranca;

public class SimplesTerrestre extends SimplesTransporte {
//	atributos da classe
	private int numeroRodas;
	protected float velocidade;

//	constructor e constructor vazio
	public SimplesTerrestre(String capacidade, int numeroRodas, float velocidade) {
		super(capacidade);
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}
	
	public SimplesTerrestre() {
		super();
	}
	
//	método visualizer
	public void visualizer () {
		super.visualizer();
		System.out.println("Número de rodas: "+this.numeroRodas);
		System.out.println("Velocidade: "+this.velocidade);
	}
//	métodos get e set
	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

}
