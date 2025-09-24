package secao2.atividade10;

// Importando bibliotecas necessárias
import java.util.ArrayList;
import java.util.List;

/*
 *  Classe Main criada para teste das classes
 *  anteriormente criadas
 */
public class Main {
    public static void main(String[] args) {
    	
    	// Array para conter formas
        List<Forma> formas = new ArrayList<>();
        
        // Adicionando formas ao array
        formas.add(new Circulo(5.0));
        formas.add(new Retangulo(4.0, 6.0));

        // Printando cada forma do array
        for (Forma forma : formas) {
            System.out.println("--------------------");
            System.out.println("Área: " + forma.getArea());
            System.out.println("Perímetro: " + forma.getPerimetro());
        }
    }
}
