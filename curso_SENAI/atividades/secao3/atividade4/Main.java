package atividades.secao3.atividade4;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void imprimirListaFilmes(List<? extends Filme> lista) {
        for (Filme filme : lista) {
            System.out.println(filme.toString());
        }
    }

    public static void main(String[] args) {
        
    	// Criando objeto da classe 'Caixa' do tipo inteiro 
    	Caixa<Integer> Objeto1 = new Caixa<Integer>();
    	// Adiciona um valor ao objeto
    	Objeto1.adicionar(1092);
    	System.out.println("Valor adicionado: " + Objeto1.obter());
    	// Tentando adicionar um valor String
    	/*Objeto1.adicionar("batata");
    	System.out.println("Valor adicionado: " + Objeto1.obter());*/
    	
    	Caixa<String> Objeto2 = new Caixa<String>();
    	Objeto2.adicionar("batata");
    	System.out.println("Valor adicionado: " + Objeto2.obter());
    	
    	// Criando lista de filmes
    	List<Filme> Filmes = new ArrayList<>();
    	Filmes.add(new Filme("O Guia do Mochileiro das Galáxias", Genero.FICCAO_CIENTIFICA));
    	Filmes.add(new Filme("Homem de Ferro", Genero.ACAO));
    	Filmes.add(new Filme("Minha mãe é uma Peça", Genero.ACAO));
    	
    	// Imprimindo lista
    	imprimirListaFilmes(Filmes);
    	
        
    }
}
