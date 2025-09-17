package secao2.Atividade4;
/*
 * Classe ContaBancaria criada para pratica de instanciacao
 * de classes
 */
public class ContaBancaria {

	// Criando variaveis da classe
	private double saldo;
	
	// Criando metodos
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
}// end class
