package atividade8POO;

public class Exercicio6Classe {

//	atributos da classe
	private String nomeCurso;
	private String duracao;
	private int vagas;
	private float valor;

//	constructor
	public Exercicio6Classe(String nomeCurso, String duracao, int vagas, float valor) {
		super();
		this.nomeCurso = nomeCurso;
		this.duracao = duracao;
		this.vagas = vagas;
		this.valor = valor;
	}

//	método visualizer
	public void visualizer() {
		System.out.println(this.nomeCurso);
		System.out.println(this.duracao);
		System.out.println(this.vagas);
		System.out.println(this.valor);
	}

//	métodos get e set
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
