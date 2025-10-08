package secao5.atividade9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NumeradorDeLinhas {

    public static void main(String[] args) {
        String arquivoEntrada = "entrada.txt";
        String arquivoSaida = "saida_numerada.txt";
        
        System.out.println("Processando o arquivo: " + arquivoEntrada);
        System.out.println("Gerando arquivo de saída: " + arquivoSaida + "\n");
        
        // Inicializa o contador de linhas
        int contadorLinhas = 1;

        // 1. Usa a sintaxe try-with-resources para garantir o fechamento AUTOMÁTICO
        // de ambos os streams (leitor e escritor), mesmo em caso de erro.
        try (
            // Abre o leitor com buffer para leitura eficiente linha por linha
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
            
            // Abre o escritor com buffer para escrita eficiente
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))
        ) {
            String linha;
            
            // 2. Lê o arquivo linha por linha usando o método readLine()
            // O loop continua enquanto readLine() não retornar 'null' (fim do arquivo).
            while ((linha = leitor.readLine()) != null) {
                
                // 3. Constrói a nova linha prefixada com o número
                String novaLinha = contadorLinhas + ": " + linha;
                
                // 4. Escreve a nova linha no arquivo de saída
                escritor.write(novaLinha);
                
                // Escreve o separador de linha
                escritor.newLine(); 
                
                // Incrementa o contador
                contadorLinhas++;
                
                // Imprime no console para feedback
                System.out.println("Linha processada: " + novaLinha);
            }

        } catch (IOException e) {
            // Trata a exceção em caso de erro de I/O (ex: arquivo não encontrado)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro no processamento: " + e.getMessage());
        }
        
        System.out.println("\nProcessamento finalizado. Total de " + (contadorLinhas - 1) + " linhas gravadas.");
    }
}
