package atividades.secao2.desafio2;


/*
 *  Criacao da classe Desafio2 para pratica 
 *  com arrays
 */
public class Desafio2 {
    public static void main(String[] args) {
    	
    	// Criando array
        ListaDeCompras lista = new ListaDeCompras();
        // Usando metodos para adicionar itens no array
        lista.addItem("Pão", 0);
        lista.addItem("Leite", 1);
        lista.imprimirLista();
        
        // Printando index especifico
        System.out.println("Item no índice 0: " + lista.getItem(0));
        
        // Tente adicionar um item em um índice inválido
        lista.addItem("Ovos", 10);
    }
}
