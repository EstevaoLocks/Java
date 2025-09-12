package inputvariables;
// Importando classe Scanner
import java.util.Scanner;
/*
 * Classe ImputVariables criada para praticar 
 * inputs para diferentes tipos de dados
 */
public class InputVariables {
	public static void main(String[] args) {
		
		// Inicializando classe Scanner
		Scanner in = new Scanner(System.in);
		
		/*
		 * Criando input Scanner para cada 
		 * tipo primitivo de dado
		 * 
		 * Realizando print de solicitacao
		 */
		System.out.print("Por favor, insira um valor String: ");
		String variosTxtInput = in.nextLine();
		
		System.out.print("Por favor, insira um valor booleano: ");
		boolean boolVal = in.nextBoolean();
		
		System.out.print("Por favor, insira um valor byte: ");
		byte byteVal = in.nextByte();
		
		System.out.print("Por favor, insira um valor char: ");
		char charVal = in.next().charAt(0);
		
		System.out.print("Por favor, insira um valor short: ");
		short shortVal = in.nextShort();
		
		System.out.print("Por favor, insira um valor int: ");
		int intVal = in.nextInt();
		
		System.out.print("Por favor, insira um valor long: ");
		long longVal = in.nextLong();
		
		System.out.print("Por favor, insira um valor float: ");
		float floatVal = in.nextFloat();
		
		System.out.print("Por favor, insira um valor double: ");
		double doubleVal = in.nextDouble();
		
		// printando valores
		System.out.println("valor String: " + variosTxtInput);
		System.out.println("valor booleano: " + boolVal);
		System.out.println("valor byte: " + byteVal);
		System.out.println("valor char: " + charVal);
		System.out.println("valor short: " + shortVal);
		System.out.println("valor int: " + intVal);
		System.out.println("valor long: " + longVal);
		System.out.println("valor float: " + floatVal);
		System.out.println("valor double: " + doubleVal);
		
	}// end method main
	
}// end class
