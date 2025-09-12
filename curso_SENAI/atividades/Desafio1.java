package atividades;
/*
 * Classe 'Desafio' criada para realizar a troca de valores
 * entre duas variaveis 'a' e 'b'
 */
public class Desafio1 {
	   public static void main(String[] args) {
	       
		   // Declarando variaveis 'a', 'b' e 'varTemporaria'
		   int a = 10;
	       int b = 25;
	       int varTemporaria;
	       
	       // Realizando a trocca de valores
	       varTemporaria = a;
	       a = b;
	       b = varTemporaria;
	      
	       // Printando resultados
	       System.out.println("a = " + a);
	       System.out.println("b = " + b);
	   }

}
