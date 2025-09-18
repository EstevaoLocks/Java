package atividades.secao2.Atividade5;
/*
 * Classe Retangulo criada para pratica de instanciacao
 * de classes
 */
public class Retangulo {

	// Criando variaveis da classe
	private double ladoA;
	private double ladoB;
	
	// Criando metodos
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getArea() {
		return this.ladoA * this.ladoB;
	}
}// end class
