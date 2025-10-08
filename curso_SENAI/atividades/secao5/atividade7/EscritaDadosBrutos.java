package secao5.atividade7;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscritaDadosBrutos {

    public static void main(String[] args) {
        
        // 1. Cria um array de bytes (dados brutos)
        // Estes números serão escritos diretamente no arquivo binário.
        byte[] dados = {10, 20, 30, 40, 50, 60, 70};
        String nomeArquivo = "dados_brutos.dat";
        
        System.out.println("Iniciando a escrita de " + dados.length + " bytes no arquivo: " + nomeArquivo);

        // 2. Usa try-with-resources com FileOutputStream
        // Isso garante que o 'outputStream' será fechado automaticamente no final do bloco try, 
        // mesmo se ocorrer uma exceção.
        try (FileOutputStream outputStream = new FileOutputStream(nomeArquivo)) {
            
            // 3. Usa o método write(byte[]) para gravar o array inteiro no arquivo
            outputStream.write(dados);
            
            System.out.println("Escrita concluída com sucesso.");
            
        } catch (IOException e) {
            // Trata a exceção em caso de erro de I/O (ex: erro de permissão)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
        
        // Observação: Você pode verificar o arquivo 'dados_brutos.dat'. 
        // Se você abri-lo como texto, verá caracteres não legíveis, pois são dados binários.
    }
}
