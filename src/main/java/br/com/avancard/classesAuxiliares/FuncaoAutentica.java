package br.com.avancard.classesAuxiliares;

import br.com.avancard.interfaces.PermitirAcesso;

public class FuncaoAutentica {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){
            return this.permitirAcesso.autentica();
    }

    public FuncaoAutentica(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }
}
