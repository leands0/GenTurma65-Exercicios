package atividade8POO;

public class Exercicio2Classe {

//	atributos (variáveis) dos funcionários

	private String nome;
	private String cargo;
	private int idade;
	private float salario;

//	constructor do funcionário para facilitar inserção de dados

	public Exercicio2Classe(String nome, String cargo, int idade, float salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
	}

// 	método visualizer para ver as informações no console

	public void visualizer () {
		System.out.println(this.nome);
		System.out.println(this.cargo);
		System.out.println(this.idade);
		System.out.println(this.salario);
	}
	
//	métodos get e set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
