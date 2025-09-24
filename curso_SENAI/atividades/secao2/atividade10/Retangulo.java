package secao2.atividade10;

/*
 *   Classe Retangulo criada para representar retangulos
 *   reais
 */
public final class Retangulo implements Forma {
	
	// Criando atributos
    private final double largura;
    private final double altura;

    // Criando metodos
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Sobrescrevendo metodos da interface
    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }
}
