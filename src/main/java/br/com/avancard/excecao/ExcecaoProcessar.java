package br.com.avancard.excecao;

public class ExcecaoProcessar extends Exception {

    public ExcecaoProcessar(String erro) {
        super("Deu ruim ao tentar processar as notas " + erro);
    }
}
