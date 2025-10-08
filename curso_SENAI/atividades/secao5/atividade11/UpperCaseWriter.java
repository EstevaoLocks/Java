package secao5.atividade11;

import java.io.FilterWriter;
import java.io.Writer;
import java.io.IOException;


/**
 * UpperCaseWriter é um FilterWriter que converte todos os caracteres de uma String
 * para maiúsculas antes de passá-los para o Writer subjacente (o 'out' protegido).
 * * Isso demonstra o Padrão Decorator, onde adicionamos uma funcionalidade
 * a um stream existente.
 */
public class UpperCaseWriter extends FilterWriter {


    /**
     * Construtor.
     * @param out O Writer subjacente que receberá os dados processados.
     */
    public UpperCaseWriter(Writer out) {
        super(out);
    }


    /**
     * Sobrescreve o método write(String) para converter a string para maiúsculas
     * antes de escrever.
     * @param str A string a ser escrita.
     * @throws IOException Se ocorrer um erro de I/O na escrita.
     */
    @Override
    public void write(String str) throws IOException {
        // Converte a string para maiúsculas
        String upperCaseStr = str.toUpperCase();
       
        // Chama o método write do Writer subjacente (this.out)
        super.write(upperCaseStr, 0, upperCaseStr.length());
    }


    // Nota: O método write(int c) também deveria ser sobrescrito para
    // ser completo, mas focamos em write(String) conforme o desafio.
}
