package aula9POOHeranca;

public class AssociacaoTeste {
	public static void main(String[] args) {
	AssociacaoProfessor prof = new AssociacaoProfessor(1, "Rafaella", "Programação");
	AssociacaoAluno alune = new AssociacaoAluno();
	
	alune.setId(1);
	alune.setNome("Thiago");
	alune.setInstrutor(prof);	// Atribuo os dados da Professora ao Objeto aluno
	
	alune.visualizar();
}
}