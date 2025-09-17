package secao2.Atividade5;


/*
 *  Criacao da classe Atividade5 para settar 
 *  e gettar os valores da classe Pessoa
 */
public class Atividade5 {
	public static void main(String[] args) {
		
		// Instanciando classe Pessoa
		Retangulo RetanguloAB = new Retangulo();
		
		// Definindo nome e ladoA do ladoB
		RetanguloAB.setLadoA(7);
		RetanguloAB.setLadoB(5);
		
		// Obtendo valor
		double area = RetanguloAB.getArea();
		
		// Printando valores
		System.out.println("Área: " + area);
		
	}// end main method
	
}// end class