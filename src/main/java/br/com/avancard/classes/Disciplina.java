package br.com.avancard.classes;

import java.util.Arrays;
import java.util.Objects;

/* Essa classe Disciplina servira para todos os objetos e instancias de notas e materias */
public class Disciplina {
    private String disciplina;
    private double[] nota = new double[3];


    public String getDisciplina() {
        return disciplina;
    }

    public double getMediaNotas(){
        double somaNotas = 0;
        for(int i = 0; i < nota.length; i++){
            somaNotas += nota[i];
        }
        return somaNotas / nota.length;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "disciplina='" + disciplina + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(disciplina, that.disciplina) && Objects.deepEquals(nota, that.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina, Arrays.hashCode(nota));
    }
}
