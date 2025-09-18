package atividades.secao2.desafio1;


/*
 *  Criacao da classe Desafio1 para settar 
 *  e gettar os valores da classe Pessoa
 */
public class Desafio1 {
	public static void main(String[] args) {
		
		// Instanciando classe Aluno
		Aluno Fulano = new Aluno();
		
		// Definindo nome e nome e nota
		Fulano.setNome("Fulano");
		Fulano.setNota(6.98);
		
		// Status aluno
		Fulano.getStatus();
		
		Fulano.setNota(743);
		
		
	}// end main method
	
}// end class