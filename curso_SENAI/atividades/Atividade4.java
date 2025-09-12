package atividades;
/*
 * Classe 'Atividade4' criada para entender as operações
 * aritmeticas com diferentes tipos de dados em Java
 */
public class Atividade4 {
	public static void main(String[] args) {
		
		// Declarando variaveis int
		int meuInt1 = 150;
		int meuInt2 = 270;
		// Declarando variaveis double
		double meuDouble1 = 9.78;
		double meuDouble2 = 13.67;
		
		// Operacoes aritmeticas com int
		int somaInt = meuInt1 + meuInt2;
		int subtracaoInt = meuInt1 - meuInt2;
		int multiplicacaoInt = meuInt1 * meuInt2;
		int divisaoInt = meuInt1 / meuInt2;
		
		// Operacoes aritmeticas com double
		double somaDouble= meuDouble1+ meuDouble2;
		double subtracaoDouble= meuDouble1 - meuDouble2;
		double multiplicacaoDouble = meuDouble1 * meuDouble2;
		Double divisaoDouble = meuDouble1 / meuDouble2;
		
		// Printando operacoes com int
		System.out.println(somaInt);
		System.out.println(subtracaoInt);
		System.out.println(multiplicacaoInt);
		System.out.println(divisaoInt);
		
		// Printando operacoes com double
		System.out.println(somaDouble);
		System.out.println(subtracaoDouble);
		System.out.println(multiplicacaoDouble);
		System.out.println(divisaoDouble);
	   }

}
