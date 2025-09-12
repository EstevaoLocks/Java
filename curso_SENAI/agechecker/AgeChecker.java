package agechecker;

/*
 *  Importando classe Scanner para 
 *  inputs
 */
import java.util.Scanner;

/*
 * Criacao da classe AgeCecker para entender
 * o uso de inputs com operadores condicionais
 */
public class AgeChecker {
	public static void main(String[] args) {

		// Instanciando classe Scanner
		Scanner in = new Scanner(System.in);
		
		// Coletando idade
		System.out.print("Digite sua idade: ");
		int idade = in.nextInt();
		
		// Coletando licenca motorista
		System.out.print("Você tem habilitação para dirigir? (y/n): ");
		char temHabilitacao = in.next().charAt(0);
		
		// if se e maior de idade e tem habilitacao
		if ((idade >= 21) && (temHabilitacao.EqualsIgnoreCase('y')))  {
			System.out.println("Você pode dirigir! :D");
		}else {
			System.out.println("Você não pode dirigir! :<");
		}// end if-else
		
	}// end method main

}// end class
