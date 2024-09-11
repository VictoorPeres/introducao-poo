package br.com.avancard;

import br.com.avancard.classes.Aluno;
import br.com.avancard.classes.Disciplina;

import javax.swing.*;
import java.util.Locale;

/* Main é um metodo auto executavel em java */
public class Main {
    public static void main(String[] args) {

        /* new Aluno() é uma instancia (Criação de objeto)*/
        /* aluno1 é uma referencia para o objeto aluno */

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
        String registroGeral = JOptionPane.showInputDialog("Digite o número do registro geral");
        String numeroCpf = JOptionPane.showInputDialog("Digite o numero do CPF");
        String nomeMae  = JOptionPane.showInputDialog("Digite o nome da mãe");
        String nomePai = JOptionPane.showInputDialog("Digite o nome do pai");
        String dataMatricula = JOptionPane.showInputDialog("Digite a data da matricula");
        String serieMatriculado = JOptionPane.showInputDialog("Digite a serie do aluno");
        String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola");


        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(idade);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serieMatriculado);
        aluno1.setNomeEscola(nomeEscola);

        for(int i=0; i < 4; i++){
            String disciplinaAluno = JOptionPane.showInputDialog("Digite a disciplina");
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(disciplinaAluno);
            disciplina.setNota(nota);
            aluno1.getDisciplinas().add(disciplina);

        }



       /* Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de dados");
        disciplina1.setNota(9);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Matemática");
        disciplina2.setNota(8);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Geografia");
        disciplina3.setNota(9.7);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java Web");
        disciplina4.setNota(3);

        aluno1.getDisciplinas().add(disciplina1);
        aluno1.getDisciplinas().add(disciplina2);
        aluno1.getDisciplinas().add(disciplina3);
        aluno1.getDisciplinas().add(disciplina4);
*/

        Locale.setDefault(Locale.US);
        String nomeAluno = aluno1.getNome();
        double media = aluno1.getMediaNota();

        System.out.println(aluno1.toString());
        System.out.printf("A média do aluno %s é %.2f%n", nomeAluno, media );
        System.out.println(aluno1.getAlunoAprovado() ? "O aluno " + aluno1.getNome() + " está aprovado" : "O aluno " + aluno1.getNome() + " está reprovado");

    }
}