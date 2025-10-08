package secao5.atividade6;

import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivoSimples {

    public static void main(String[] args) {
        // Nome do arquivo a ser lido
        String nomeArquivo = "entrada.txt";
        FileReader leitor = null; // Inicializado como null para ser acessível no bloco finally
        
        System.out.println("Iniciando a leitura do arquivo: " + nomeArquivo + "\n");
        
        try {
            // 1. Usa FileReader (Character Stream) para abrir o arquivo
            leitor = new FileReader(nomeArquivo);
            int caractereLido;

            // 2. Implementa um loop para ler cada caractere
            // O método read() retorna o código ASCII do caractere ou -1 se o fim do arquivo for atingido.
            while ((caractereLido = leitor.read()) != -1) {
                // Converte o código ASCII de volta para um caractere e imprime no console
                System.out.print((char) caractereLido);
            }

        } catch (IOException e) {
            // 3. Trata a exceção em caso de erro (ex: arquivo não encontrado)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        } finally {
            // O bloco finally garante que o recurso (FileReader) será fechado,
            // independentemente de ter ocorrido uma exceção ou não.
            try {
                if (leitor != null) {
                    leitor.close();
                    System.out.println("\n\nLeitor de arquivo fechado com sucesso.");
                }
            } catch (IOException e) {
                // Trata exceções caso o fechamento do arquivo falhe
                System.err.println("Erro ao tentar fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
