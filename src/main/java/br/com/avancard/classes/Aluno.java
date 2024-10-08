package br.com.avancard.classes;

import br.com.avancard.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa {
    /* Atributos da classe */
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    /* Atributo de lista */
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();


    /* Construtor com sobrecarga */
    public Aluno() {

    }
    public Aluno(String nome){
        this.nome = nome;
    }
    public Aluno(String nome, int idade, String dataNascimento){
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public double salario() {
        return 1500.0;
    }


    /* Métodos getters e setters
    * Os setters são métodos para adicionar dados aos atributos
    * Os getters são métodos para resgatar dados já adicionados */


    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    /*Metodo que retorna a média do aluno*/
    public double getMediaNota(){
        double somaNotas = 0.0;
        for(Disciplina disciplina : this.disciplinas){
        somaNotas += disciplina.getMediaNotas();
        }

        return somaNotas / disciplinas.size();
    }

    /* Metodo que retorna se o aluno foi aprovado */
    public boolean getAlunoAprovado(){
        if(this.getMediaNota() > 7.00){
            return true;
        }else{
            return false;
        }
    }

    public String getAlunoAprovado2(){
        if(this.getMediaNota() > 5.00){
            if(this.getMediaNota() > 7.00){
                return StatusAluno.APROVADO;
            }else {
                return StatusAluno.RECUPERACAO;
            }
        }else{
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(registroGeral, aluno.registroGeral) && Objects.equals(numeroCpf, aluno.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registroGeral, numeroCpf);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
