package secao5.atividade5;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        // Cria o objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar os dados
        double peso;
        double altura;
        double imc;

        // --- 1. ENTRADA (INPUT) ---
        
        // Solicita e lê o peso (double)
        System.out.print("Digite seu peso em kg (ex: 75.5): ");
        peso = scanner.nextDouble(); 

        // Solicita e lê a altura (double)
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        altura = scanner.nextDouble(); 
        
        // Fecha o Scanner
        scanner.close(); 
        
        // --- 2. PROCESSAMENTO ---
        
        // Calcula o IMC: Peso / (Altura * Altura)
        imc = peso / (altura * altura);
        
        // --- 3. SAÍDA (OUTPUT FORMATADO) ---
        
        System.out.println("\n--- Resultado ---");
        // Usa System.out.printf para formatar a saída.
        // O formato "%.2f" garante que o número double (f) seja exibido com
        // exatamente duas casas decimais (.2).
        System.out.printf("Seu IMC calculado é: %.2f%n", imc);
    }
}
