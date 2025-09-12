package stringoperations;
/*
 * Classe 'StringOperatios' criada para realizar
 * operacoes com strings
 */
public class StringOperations {
	public static void main (String[] args) {
		
		// Declarando variaveis 'str[...]'
		String str1 = "Hello";
		String str2 = "Estevão";
		String str3;// String nao iniciada
		
		// Atribuindo valor a var 'str3'
		str3 = "You are " + str2;
		
		// Printando mensagem de boas vindas
		System.out.println("Welcome, " + str3);
		
		// Printando tamanho da variavel
		System.out.println("The length of 'str1' is: " + str1.length());
		// Printando parcialmente a string 'str3'
		System.out.println("The substring of 'str3' is: " + str3.substring(0,5));
		// Printando var 'str2' em caixa alta
		System.out.println("The upper case of 'str2' is: " + str2.toUpperCase());
		
	}// end method main
	
}// end class
