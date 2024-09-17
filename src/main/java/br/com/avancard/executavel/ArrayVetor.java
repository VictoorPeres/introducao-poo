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

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Floriano Oliveira");
        aluno2.setNomeEscola("JDEV Treinamento");

        /* Criação da disciplina */
        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Arrays e Vetores");
        double[] notas3 = {7, 4.3, 5, 2};
        disciplina3.setNota(notas3);
        aluno2.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Tratamento de Exceções");
        double[] notas4 = {9, 8, 9.5, 9.9};
        disciplina4.setNota(notas4);
        aluno2.getDisciplinas().add(disciplina4);

        /*
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
*/
        Aluno[] arrayAlunos = new Aluno[2];

        arrayAlunos[0] = aluno;
        arrayAlunos[1] = aluno2;

        for (Aluno aluno1 : arrayAlunos) {
            System.out.println("O nome do alunoe é: " + aluno1.getNome());
            for (Disciplina disciplina1 : aluno1.getDisciplinas())    {
                System.out.println("Nome da disciplina: " +disciplina1.getDisciplina()  );
                for (int aux = 0; aux < disciplina1.getNota().length; aux++) {
                    System.out.println("Nota" + aux + ": " + disciplina1.getNota()[aux]);
                }
            }
        }



    }
}
