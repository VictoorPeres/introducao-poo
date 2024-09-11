package br.com.avancard;

import br.com.avancard.classes.Aluno;

/* Main é um metodo auto executavel em java */
public class Main {
    public static void main(String[] args) {

        /* new Aluno() é uma instancia (Criação de objeto)*/
        /* aluno1 é uma referencia para o objeto aluno */

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João da Silva");
        aluno1.setIdade(50);
        aluno1.setDataNascimento("18/10/1974");
        aluno1.setRegistroGeral("445.544.545-45");
        aluno1.setNumeroCpf("445.544.545-45");
        aluno1.setNomeMae("Shirlei");
        aluno1.setNomePai("Antonio");
        aluno1.setDataMatricula("10/01/2019");
        aluno1.setSerieMatriculado("5");
        aluno1.setNomeEscola("Escola JDEV Treinamento");

        System.out.println(aluno1.toString());

        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Meire", 58, "13/01/1966");

        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());

    }
}