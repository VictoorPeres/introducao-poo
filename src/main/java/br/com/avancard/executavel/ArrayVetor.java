package br.com.avancard.executavel;

import br.com.avancard.classes.Aluno;
import br.com.avancard.classes.Disciplina;

public class ArrayVetor {
    public static void main(String[] args) {

        /* Array pode ser de todos os tipos de dados e objetos também */

        /* Array sempre deve ter a quantidade de posições definidas */

        /*double[] notas = new double[4];

        System.out.println();*/
        /* Criação do aluno */
        Aluno aluno = new Aluno();
        aluno.setNome("Victor Oliveira");
        aluno.setNomeEscola("JDEV Treinamento");

        /* Criação da disciplina */
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Arrays e Vetores");
        double[] notas = {10, 4.3, 7.5, 2};
        disciplina.setNota(notas);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Tratamento de Exceções");
        double[] notas2 = {8.1, 3.3, 9.5, 9.9};
        disciplina2.setNota(notas2);
        aluno.getDisciplinas().add(disciplina2);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Escola: " + aluno.getNomeEscola());

        for (Disciplina disciplinaAluno : aluno.getDisciplinas()) {

            System.out.println("##########################");
            System.out.println("Disciplina: " + disciplinaAluno.getDisciplina());
            double notaMaxima = 0;
            for(int i = 0; i < disciplinaAluno.getNota().length; i++){
                System.out.println("N"+ (i+1) + ": " + disciplinaAluno.getNota()[i]);
                if(disciplinaAluno.getNota()[i] > notaMaxima){
                    notaMaxima = disciplinaAluno.getNota()[i];
                }
            }
            System.out.println("A maior nota da disciplina " + disciplinaAluno.getDisciplina() + " é: " + notaMaxima);
        }
        System.out.println("###########################");
        System.out.println("Média do aluno " + aluno.getNome() + ": " + aluno.getMediaNota());




    }
}
