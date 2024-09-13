package br.com.avancard.classes;

import br.com.avancard.interfaces.PermitirAcesso;

import java.util.Objects;

public class Secretario extends Pessoa implements PermitirAcesso{
    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    @Override
    public double salario() {
        return 2000.0;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secretario that = (Secretario) o;
        return registro == that.registro;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registro);
    }

    @Override
    public boolean autentica() {
        return login.equals("admin") && senha.equals("admin");
    }
}
