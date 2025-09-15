package valuechecker;

/*
 *  Importando classe Scanner para 
 *  inputs
 */
import java.util.Scanner;

/*
 * Criacao da classe AgeCecker para entender
 * o uso de inputs com operadores condicionais
 */
public class ValueChecker {
	public static void main(String[] args) {

		// Instanciando classe Scanner
		Scanner in = new Scanner(System.in);
		
		// Coletando numero inteiro
		System.out.print("Digite um número inteiro: ");
		int numero = in.nextInt();
		
		// if se e maior de idade e tem habilitacao
		if (numero == 7)  {
			System.out.println("That's lucky");
		}else if (numero == 13) {
			System.out.println("That's unlcky");
		}else {
			System.out.println("That number is neighter lucky or unlucky");
		}
		// end if-else
		
		in.close();
		
	}// end method main

}// end class