package secao5.atividade1;

import java.util.Scanner;

public class CalculadoraSomaSimples {

    public static void main(String[] args) {
        // 1. Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar os números
        int primeiroNumero;
        int segundoNumero;
        int soma;

        // --- ENTRADA (INPUT) ---
        
        // 2. Solicita e lê o primeiro número inteiro
        System.out.print("Por favor, digite o primeiro número inteiro: ");
        primeiroNumero = scanner.nextInt(); 

        // 3. Solicita e lê o segundo número inteiro
        System.out.print("Agora, digite o segundo número inteiro: ");
        segundoNumero = scanner.nextInt();
        
        // 4. Fecha o objeto Scanner para liberar recursos
        scanner.close(); 
        
        // --- PROCESSAMENTO ---
        
        // 5. Calcula a soma
        soma = primeiroNumero + segundoNumero;
        
        // --- SAÍDA (OUTPUT) ---
        
        // 6. Imprime o resultado da soma em um formato amigável
        System.out.println("\n--- Resultado ---");
        System.out.println("A soma dos números " + primeiroNumero + " e " + segundoNumero + " é: " + soma);
    }
}
