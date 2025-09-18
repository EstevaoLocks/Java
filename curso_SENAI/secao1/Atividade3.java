package secao1;
/*
 * Classe 'Atividade3' criada para entender as conversoes
 * de tipos de valores em Java
 */
public class Atividade3 {
	   public static void main(String[] args) {
		    
		   // Declarando variaveis
		   int meuInt = 150;
		   // convertendo tipo int para short
		   short meuShort = (short) meuInt;
		   
		   
		   double meuDouble = 9.78;
		   /*
		    * Convertendo tipo de double para int
		    * aproximando para o inteiro mais proximo
		    */
		   int outroInt = (int) Math.round(meuDouble);
		   float meuFloat = 12.34F;
		   
		   // Printando valores das variaveis com tipos alterados
		   System.out.println(meuShort);
		   System.out.println(outroInt);
		   System.out.println(meuFloat);
	   }

}
