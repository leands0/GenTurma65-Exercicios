package atividade8POO;

public class Exercicio5Classe {
	
//	atributos da classe
	private String filme;
	private String cadeira;
	private float valor;
	private float horario;

//	método constructor
	public Exercicio5Classe(String filme, String cadeira, float valor, float horario) {
		super();
		this.filme = filme;
		this.cadeira = cadeira;
		this.valor = valor;
		this.horario = horario;
	}

//	método visualizer
	public void visualizer() {
		System.out.println(this.filme);
		System.out.println(this.cadeira);
		System.out.println(this.valor);
		System.out.println(this.horario);
	}

//	métodos get e set
	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public String getCadeira() {
		return cadeira;
	}

	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getHorario() {
		return horario;
	}

	public void setHorario(float horario) {
		this.horario = horario;
	}

}
