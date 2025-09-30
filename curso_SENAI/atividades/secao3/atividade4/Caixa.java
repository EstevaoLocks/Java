package atividades.secao3.atividade4;

public class Caixa<T> {
    private T item;

    public void adicionar(T item) {
        this.item = item;
    }

    public T obter() {
        return this.item;
    }
}
