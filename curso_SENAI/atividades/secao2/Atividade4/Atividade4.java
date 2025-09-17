package secao2.Atividade4;
/*
 *  Criacao da classe Atividade4 para settar 
 *  e gettar os valores da classe Pessoa
 */
public class Atividade4 {
	public static void main(String[] args) {
		
		// Instanciando classe Pessoa
		ContaBancaria Produto1 = new ContaBancaria();
		
		// Definindo nome e idade do objeto
		Produto1.depositar(1000);
		
		// Obtendo valores setados
		double saldo = Produto1.getSaldo();
		
		// Printando valoresvalores
		System.out.println("Saldo: " + saldo);
		
		// Tentando alterar manualmente
		Produto1.saldo = 700;
		saldo = Produto1.getSaldo();
		System.out.println("Saldo: " + saldo);
		
	}// end main method
	
}// end class