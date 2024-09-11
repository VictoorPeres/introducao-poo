package br.com.avancard;

import br.com.avancard.classes.Aluno;

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
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a n1"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a n2"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a n3"));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a n4"));

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
        aluno1.setN1(n1);
        aluno1.setN2(n2);
        aluno1.setN3(n3);
        aluno1.setN4(n4);

        Locale.setDefault(Locale.US);
        String nomeAluno = aluno1.getNome();
        double media = aluno1.getMediaNota();

        System.out.println(aluno1.toString());
        System.out.printf("A média do aluno %s é %.2f%n", nomeAluno, media );
        System.out.println(aluno1.getAlunoAprovado() ? "O aluno " + aluno1.getNome() + " está aprovado" : "O aluno " + aluno1.getNome() + " está reprovado");

    }
}