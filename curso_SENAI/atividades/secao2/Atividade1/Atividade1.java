package atividades.secao2.Atividade1;

/*
 *  Criacao da classe Atividade1 para settar 
 *  e gettar os valores da classe Pessoa
 */
public class Atividade1 {
	public static void main(String[] args) {
		
		// Instanciando classe Pessoa
		Pessoa Alguem = new Pessoa();
		
		// Definindo nome e idade do objeto
		Alguem.setterNome("Cartandesto");
		Alguem.setterIdade(37);
		
		// Obtendo valores setados
		String nome = Alguem.getterNome();
		int idade = Alguem.getterIdade();
		
		// Printando valores
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
	}// end main method
	
}// end class
