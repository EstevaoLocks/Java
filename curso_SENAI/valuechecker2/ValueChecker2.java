package valuechecker2;

/*
 *  Importando classe Scanner para 
 *  inputs
 */
import java.util.Scanner;

/*
 * Criacao da classe AgeCecker para entender
 * o uso de inputs com operadores condicionais e 
 * lacos de repeticao
 */
public class ValueChecker2 {
	public static void main(String[] args) {

		// Instanciando classe Scanner
		Scanner in = new Scanner(System.in);

		int numero = 0;
		
		do {
			// Criando var numero
			System.out.print("Digite um número inteiro: ");
			numero = in.nextInt();
			
			// if se e maior de idade e tem habilitacao
			if (numero == 7)  {
				System.out.println("That's lucky");
			}else if (numero == 13) {
				System.out.println("That's unlcky");
			}else if (numero == 0) {
				break;
			}else {
				System.out.println("That number is neighter lucky or unlucky");
			}// end if-else
			
			// Iniciando um laco de repeticao
		} while (numero != 0);
		
		in.close();
		
	}// end method main

}// end class