package atividade8POO;

public class Exercicio1Classe {
	
// atributos da classe Exercicio1classe
	private String nome;
	private String profissao;
	private int idade;
	private float altura;
	
//	método construtor
	public Exercicio1Classe(String nome, String profissao, int idade, float altura) {
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.altura = altura;
	}
	
//	métodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
//	método visualizar
	public void visualiza() {
		System.out.println(this.getNome());
		System.out.println(this.getProfissao());
		System.out.println(this.getIdade());
		System.out.println(this.getAltura());		
	}
	
	
	
	
	
	
	
}
