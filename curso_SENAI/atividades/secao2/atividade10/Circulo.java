package secao2.atividade10;

/*
 *  Classe Circulo criada para representar 
 *  circunferencias
 */
public final class Circulo implements Forma {
	
	// Atributos
    private final double raio;

    // Metododos
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Metodos sobrescritos
    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}

