package atividades.secao2.desafio2;

import java.util.Arrays;

/*
 * Classe ListaDeCompras criada para pratica de instanciacao
 * de classes e arrays
 */
public class ListaDeCompras {

	// Criando variaveis da classe
	private String[] itens = new String[5];
	
	/*
	 *  Criando metodos
	 */
	// Adiciona itens ao array
	public void addItem(String item, int index) {
		// Valida index
		if ((index >= 0) && (index < itens.length)) {
			this.itens[index] = item;
		}else {
			System.out.println("Index inexistente.");
		}
	}// end addItem mehtod
	
	public String getItem(int index) {
		// Valida index
		if ((index >= 0) && (index < itens.length)) {
			return itens[index];
		}else {
			System.out.println("Index inexistente.");
			return null;
		}
	}// end addItem mehtod
	
	public void imprimirLista() {
		System.out.println(Arrays.toString(itens));
	}
	
}// end class
