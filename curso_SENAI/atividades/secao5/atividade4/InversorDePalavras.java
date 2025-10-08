package secao5.atividade4;

import java.util.Scanner;

public class InversorDePalavras {

    /**
     * Função auxiliar para inverter uma String.
     * @param palavra A string a ser invertida.
     * @return A string invertida.
     */
    public static String inverterString(String palavra) {
        // Usa a classe StringBuilder para facilitar a inversão
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        // --- 1. ENTRADA ---
        
        // Solicita a entrada, usando apenas uma chamada nextLine()
        System.out.print("Digite três palavras separadas por espaço: ");
        entrada = scanner.nextLine(); 
        
        // Exibe a frase original
        System.out.println("Frase original: " + entrada);

        // --- 2. PROCESSAMENTO (Split e Inversão) ---
        
        // Usa o método split() para dividir a String em um array
        // O delimitador é o espaço (" ")
        String[] palavras = entrada.split(" ");
        
        // Verifica se há pelo menos três palavras antes de prosseguir
        if (palavras.length >= 3) {
            // A segunda palavra está no índice 1 do array
            String palavraAInverter = palavras[1];
            
            // Inverte a segunda palavra usando a função auxiliar
            String palavraInvertida = inverterString(palavraAInverter);
            
            // Substitui a palavra original pela versão invertida no array
            palavras[1] = palavraInvertida;
            
            // Junta o array de volta em uma única String para a saída
            String fraseModificada = String.join(" ", palavras);
            
            // --- 3. SAÍDA ---
            System.out.println("Frase modificada: " + fraseModificada);
            
        } else {
            System.out.println("Erro: Por favor, digite pelo menos três palavras.");
        }

        scanner.close(); 
    }
}
