package secao2.Atividade3;
/*
 *  Criacao da classe Atividade3 para settar 
 *  e gettar os valores da classe Pessoa
 */
public class Atividade3 {
	public static void main(String[] args) {
		
		// Instanciando classe Pessoa
		Produto Produto1 = new Produto();
		
		// Definindo nome e idade do objeto
		Produto1.setNome("Cartandesto");
		Produto1.setPreco(-70);
		Produto1.setQuantidadeEmEstoque(-70);
		
		// Obtendo valores setados
		String nome = Produto1.getNome();
		double preco = Produto1.getPreco();
		int quantidadeEmEstoque = Produto1.getQuantidadeEmEstoque();
		
		// Printando valoresvalores
		System.out.println("Nome: " + nome);
		System.out.println("Preco: " + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
		
	}// end main method
	
}// end class