package secao4.atividade2;

public class ConstrutorEmail {
    public static void main(String[] args) {
        String[] destinatarios = {"ana@dominio.com", "beto@dominio.com", "carla@dominio.com", "daniel@dominio.com"};
        
        System.out.println("Lista de Destinatarios:");
        
        // 1. Inicializa o StringBuilder (melhor performance para muitas modificacoes)
        StringBuilder listaEmails = new StringBuilder();
        
        // 2. Itera sobre o array e usa append()
        for (String email : destinatarios) {
            listaEmails.append(email);
            listaEmails.append(";"); // Adiciona o delimitador
        }
        
        System.out.println("String construida (com delimitador extra): " + listaEmails.toString());

        // 3. Remove o ultimo caractere (o ';' extra)
        // O indice do ultimo caractere eh o length() - 1
        if (listaEmails.length() > 0) {
            int ultimoIndice = listaEmails.length() - 1;
            listaEmails.deleteCharAt(ultimoIndice);
        }
        
        System.out.println("----------------------------------------");
        
        // 4. Imprime o resultado final (convertendo para String)
        String mensagemFinal = listaEmails.toString();
        System.out.println("Lista de E-mails Final: " + mensagemFinal);
    }
}
