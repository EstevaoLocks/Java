package secao3.atividade2;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        // Criamos um conjunto que só aceita tarefas (String)
        Set<String> tarefas = new HashSet<>();
        /*
         *  Para manter a seguranca, o todos os tipos de dados inseridos
         *  no HashSet sao do mesmo tipo (classe). Assim, qualquer dado
         *  inserido no set deve, antes entrar em um Hash, ser de uma classe específica
         */

        // 1. Adicionar tarefas ao conjunto
        System.out.println("--- Adicionando tarefas ---");
        tarefas.add("Comprar pão");
        tarefas.add("Estudar Java");
        tarefas.add("Comprar pão"); // Tentando adicionar uma duplicata
        tarefas.add("Lavar o carro");
        System.out.println("Conjunto de tarefas: " + tarefas);
        // A ordem pode variar, mas 'Comprar pão' aparece apenas uma vez
        // Ex: [Lavar o carro, Comprar pão, Estudar Java]
        /*
         *  Item add "Comprar pão" adicionado duas vezes, por tanto o chamado
         *  Hash Set ignora o segundo.
         */

        // 2. Verificar se uma tarefa já existe
        boolean temTarefa = tarefas.contains("Estudar Java");
        System.out.println("\nA tarefa 'Estudar Java' está no conjunto? " + temTarefa); // Saída: true
        
        // 3. Remover uma tarefa
        System.out.println("\n--- Removendo uma tarefa ---");
        tarefas.remove("Lavar o carro");
        System.out.println("Conjunto após remover 'Lavar o carro': " + tarefas);
        /*
         *  o HashSet não permite valores iguais, já que não tem um indice como 
         *  metrica para pegar os valores ele usa, ele busca pelo elemento solicitado, assim,
         *  não é possivel possuir dois elementos iguais
         *   
         */
    }
}
