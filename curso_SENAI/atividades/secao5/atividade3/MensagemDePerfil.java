package secao5.atividade3;

import java.util.Scanner;

public class MensagemDePerfil {

    public static void main(String[] args) {
        // 1. Cria o objeto Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar os dados
        String nomeCompleto;
        String cidade;
        int anoNascimento;

        // --- ENTRADA (INPUT) ---
        
        // 2. Coleta o nome completo (String)
        System.out.print("Digite seu nome completo: ");
        nomeCompleto = scanner.nextLine(); 

        // 3. Coleta a cidade (String)
        System.out.print("Em qual cidade você mora? ");
        cidade = scanner.nextLine(); 

        // 4. Coleta o ano de nascimento (int)
        System.out.print("Qual seu ano de nascimento? ");
        anoNascimento = scanner.nextInt(); 
        
        // 5. Fecha o objeto Scanner
        scanner.close(); 
        
        // --- SAÍDA (OUTPUT) ---
        
        // 6. Imprime a mensagem de perfil combinada em uma única linha
        System.out.println("---");
        System.out.println("Perfil criado: " + nomeCompleto + ", de " + cidade + ", nascido(a) em " + anoNascimento + ".");
    }
}
