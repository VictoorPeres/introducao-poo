package br.com.avancard.classes;

import java.util.Objects;

public class Secretario extends Pessoa {
    private String registro;
    private String nivelCargo;
    private String experiencia;

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
}
