package atividades.secao2.atividade9;

public final class Carro implements Veiculo {
    private final double consumoPorLitro;
    private final double precoCombustivelPorLitro;

    public Carro(double consumoPorLitro, double precoCombustivelPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
        this.precoCombustivelPorLitro = precoCombustivelPorLitro;
    }

    @Override
    public double calcularCustoPorKm(double distancia) {
        return (distancia / consumoPorLitro) * precoCombustivelPorLitro;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}

