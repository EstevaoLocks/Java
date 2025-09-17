package secao2.desafio1;
/*
 * Classe Aluno criada para pratica de instanciacao
 * de classes
 */
public class Aluno {

	// Criando variaveis da classe
	private String nome;
	private double nota;
	
	// Criando metodos
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota(double nota) {
		if ((nota > 0) && (nota < 10)) {
			this.nota = nota;
		}else {
			throw new IllegalArgumentException("A nota tem que estar entre 0 e 10.");
		}
	}
	public String getNome() {
		return this.nome;
	}
	public double getNota() {
		return this.nota;
	}
	public void getStatus() {
		if (nota >= 7) {
			System.out.println("Aprovado");
		}else if (nota >= 5) {
			System.out.println("Em recuperação");
		}else {
			System.out.println("Reprovado");
		}
	}
}// end class
