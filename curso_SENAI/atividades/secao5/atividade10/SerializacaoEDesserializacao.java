package secao5.atividade10;

import java.io.*;

public class SerializacaoEDesserializacao {
    
    // Nome do arquivo onde o objeto será salvo
    private static final String ARQUIVO_SER = "produto.ser";

    public static void main(String[] args) {
        
        // 1. Criação do Objeto Original
        // O código é 101, mas foi marcado como transient na classe Produto.
        Produto original = new Produto("Celular S10", 1500.0, 101);
        System.out.println("--- 1. OBJETO ORIGINAL ---");
        System.out.println("Objeto Original: " + original);
        System.out.println("Código Original (transient): " + original.getCodigo());
        
        // ----------------------------------------
        // A. SERIALIZAÇÃO (Salvando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 2. SERIALIZANDO Objeto para o arquivo: " + ARQUIVO_SER);
        try (
            // Usa FileOutputStream para o fluxo de bytes no arquivo
            FileOutputStream fileOut = new FileOutputStream(ARQUIVO_SER);
            // Usa ObjectOutputStream para escrever o objeto no fluxo de bytes
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            // Escreve o objeto no arquivo.
            objOut.writeObject(original);
            System.out.println("Serialização concluída. Estado salvo.");
            
        } catch (IOException i) {
            i.printStackTrace();
            return; // Termina se a serialização falhar
        }

        // ----------------------------------------
        // B. DESSERIALIZAÇÃO (Carregando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 3. DESSERIALIZANDO Objeto do arquivo: " + ARQUIVO_SER);
        Produto restaurado = null;
        
        try (
            // Usa FileInputStream para ler o fluxo de bytes do arquivo
            FileInputStream fileIn = new FileInputStream(ARQUIVO_SER);
            // Usa ObjectInputStream para ler o objeto a partir do fluxo de bytes
            ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            // Lê o objeto e faz o casting para a classe Produto
            restaurado = (Produto) objIn.readObject();
            System.out.println("Desserialização concluída. Objeto restaurado.");
            
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Produto não encontrada.");
            c.printStackTrace();
            return;
        }
        
        // ----------------------------------------
        // 4. COMPROVAÇÃO DO EFEITO TRANSIENT
        // ----------------------------------------
        System.out.println("\n--- 4. COMPROVAÇÃO ---");
        System.out.println("Objeto Restaurado: " + restaurado);
        
        // Comprova que o campo 'codigo' foi perdido
        System.out.println("\nEfeito Transient:");
        System.out.println("Nome (Salvo): " + restaurado.getNome());
        System.out.println("Preço (Salvo): " + restaurado.getPreco());
        System.out.println("Código (Transient, PERDIDO): " + restaurado.getCodigo());
    }
}

