package secao3.atividade1;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criamos uma lista que só aceita nomes (String)
        ArrayList<String> listaPresenca = new ArrayList<>();
        /*
         *   A linha ArrayList<String> usa genéricos para garantir 
         *   que a lista só armazene Strings, evitando erros.
         */

        // 1. Adicionar nomes à lista (eles são adicionados no final)
        System.out.println("--- Adicionando nomes ---");
        listaPresenca.add("Ana");//  <-- Primeiro nome
        System.out.println("Nome inserido: Ana");
        listaPresenca.add("Bruno");//  <-- Segundo nome
        System.out.println("Nome inserido: Bruno");
        listaPresenca.add("Carla");//  <-- Terceiro nome
        System.out.println("Nome inserido: Carla");
        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Ana, Bruno, Carla]
        /*
         * No código acima, cada add adiciona o valor especificado ao final da fila.
         * Assim, ao printar a lista, teremos os valores printados sequencialmente da
         * mesma forma que foram inseridos: Ana, Bruno e Carla.
         */
        
        // 2. Acessar um nome pela sua posição (índice)
        String primeiroNome = listaPresenca.get(0);
        System.out.println("O primeiro nome da lista é: " + primeiroNome); // Saída: Ana
        /*
         *  A funcao get busca um valor em uma classe. No caso acima,
         *  a funcao get está com o parametro "0", o que significa que,
         *  dentro da classe 'listaPresenca' (nosso ArrayList), e para 
         *  ser pego o valor com o indice "0".
         */

        // 3. Remover um nome
        System.out.println("\n--- Removendo um nome ---");
        listaPresenca.remove("Bruno");
        System.out.println("Lista após remover 'Bruno': " + listaPresenca); // Saída: [Ana, Carla]
        /*
         *  A funcao Remove exclue um registro do ArrayList. No exemplo acima, 
         *  esta funcao nao recebe como parametro o indice, mas sim o conteudo que
         *  deve ser removido, no caso, o nome 'Bruno'.
         */
    }
}
