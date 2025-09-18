package atividades.secao2.Atividade2;
/*
 * Classe pessoa criada para pratica de instanciacao
 * de classes
 */
public class Pessoa {

	// Criando variaveis da classe
	private String nome;
	private int idade;
	
	// Criando metodos
	public void setterNome(String nome) {
		this.nome = nome;
	}
	public void setterIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
			
		}else {
			System.out.print("Erro: a idade não pode ser um valor negativo");
		}
	}
	public String getterNome() {
		return this.nome;
	}
	public int getterIdade() {
		return this.idade;
	}
}// end class
