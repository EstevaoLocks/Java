package atividades.secao2.Atividade3;
/*
 * Classe Produto criada para pratica de instanciacao
 * de classes
 */
public class Produto {

	// Criando variaveis da classe
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;
	
	// Criando metodos
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(int preco) {
			this.preco = preco;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	public String getNome() {
		return this.nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public int getQuantidadeEmEstoque() {
		return this.quantidadeEmEstoque;
	}
}// end class
