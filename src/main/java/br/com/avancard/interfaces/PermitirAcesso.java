package br.com.avancard.interfaces;

/* Sera o nosso contrato de autenticação */
public interface PermitirAcesso {
    public boolean autentica(String login, String senha); /* Apenas declaração do metodo */
    public boolean autentica(); /* Apenas declaração do metodo */
}
