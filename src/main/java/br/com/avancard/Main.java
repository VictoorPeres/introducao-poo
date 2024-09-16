package br.com.avancard;

import br.com.avancard.classes.Aluno;
import br.com.avancard.classes.Disciplina;
import br.com.avancard.classes.Secretario;
import br.com.avancard.classesAuxiliares.FuncaoAutentica;
import br.com.avancard.constantes.StatusAluno;
import br.com.avancard.interfaces.PermitirAcesso;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* Main é um metodo auto executavel em java */
public class Main {
    public static void main(String[] args) {
        try {

            String login = JOptionPane.showInputDialog("Digite seu login:");
            String senha = JOptionPane.showInputDialog("Digite sua senha:");
            //Usando o metodo autentica da interface, apenas para a classe secretario.
            if (new FuncaoAutentica(new Secretario(login, senha)).autenticar()) {

                List<Aluno> alunos = new ArrayList<Aluno>();

                HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

       /* List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
                for (int aux = 0; aux < 5; aux++) {
                    /* new Aluno() é uma instancia (Criação de objeto)*/
                    /* aluno1 é uma referencia para o objeto aluno */

                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + (aux + 1));
        /*int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
        String registroGeral = JOptionPane.showInputDialog("Digite o número do registro geral");
        String numeroCpf = JOptionPane.showInputDialog("Digite o numero do CPF");
        String nomeMae  = JOptionPane.showInputDialog("Digite o nome da mãe");
        String nomePai = JOptionPane.showInputDialog("Digite o nome do pai");
        String dataMatricula = JOptionPane.showInputDialog("Digite a data da matricula");
        String serieMatriculado = JOptionPane.showInputDialog("Digite a serie do aluno");
        String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola");*/


                    Aluno aluno1 = new Aluno();
                    aluno1.setNome(nome);
        /*aluno1.setIdade(idade);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serieMatriculado);
        aluno1.setNomeEscola(nomeEscola);*/

                    for (int i = 1; i <= 1; i++) {
                        String disciplinaAluno = JOptionPane.showInputDialog("Digite a disciplina " + i);
                        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota " + i));

                        Disciplina disciplina = new Disciplina();
                        disciplina.setDisciplina(disciplinaAluno);
                        disciplina.setNota(nota);
                        aluno1.getDisciplinas().add(disciplina);

                    }
                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
                    int posicao = 1;
                    while (aluno1.getDisciplinas().size() > 0 && escolha == 0) {

                        if (escolha == 0) {
                            String discplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4?");
                            aluno1.getDisciplinas().remove(Integer.parseInt(discplinaRemover) - posicao);
                            posicao++;
                        }
                        escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
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
                    alunos.add(aluno1);
                }
                //
                maps.put(StatusAluno.APROVADO, new ArrayList<>());
                maps.put(StatusAluno.REPROVADO, new ArrayList<>());
                maps.put(StatusAluno.RECUPERACAO, new ArrayList<>());
                /*Lista de alunos aprovados, reprovados e em recuperação*/
                for (Aluno aluno : alunos) {
                    if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                        maps.get(StatusAluno.APROVADO).add(aluno);
                    } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                        maps.get(StatusAluno.REPROVADO).add(aluno);
                    } else {
                        maps.get(StatusAluno.RECUPERACAO).add(aluno);
                    }
                }

                System.out.println("----------------------Lista dos aprovados---------------------------");
                for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                    System.out.println("O aluno " + aluno.getNome() + " esta " + StatusAluno.APROVADO + " com média " + aluno.getMediaNota());
                }
                System.out.println("----------------------Lista dos reprovados---------------------------");
                for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                    System.out.println("O aluno " + aluno.getNome() + " esta " + StatusAluno.REPROVADO + " com média " + aluno.getMediaNota());
                }
                System.out.println("--------------------Lista dos em recuperação-------------------------");
                for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                    System.out.println("O aluno " + aluno.getNome() + " esta " + StatusAluno.RECUPERACAO + " com média " + aluno.getMediaNota());
                }
                // percorrendo listas
      /*  for(int pos = 0; pos < alunos.size(); pos++) {
            Aluno aluno = alunos.get(pos);
            if(aluno.getNome().equals("victor")){
                alunos.remove(pos);
            }else{
                System.out.println(aluno.toString());
                System.out.println("A média do aluno " + aluno.getNome() + " é " +  aluno.getMediaNota());
                System.out.println(aluno.getAlunoAprovado() ? "O aluno está aprovado" : "O aluno está reprovado");
            }
        }

        for(int pos = 0; pos < alunos.size(); pos++) {
            Aluno aluno = alunos.get(pos);

            if(aluno.getNome().equalsIgnoreCase("maria")){
                Aluno trocar = new Aluno();
                trocar.setNome("Aluno trocado");
                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Astronomia");
                disciplina.setNota(10.00);

                trocar.getDisciplinas().add(disciplina);
                alunos.set(pos, trocar);
                aluno = alunos.get(pos);
            }
            System.out.println("Alunos que sobraram na lista");
            System.out.println(aluno.getNome());
            System.out.println("Suas materias são");
            for(int i = 0 ; i < aluno.getDisciplinas().size(); i++) {
                Disciplina disciplina = aluno.getDisciplinas().get(i);
                System.out.println(disciplina.getDisciplina());
            }
        }

        for (Aluno aluno : alunos){
            if(aluno.getNome().equalsIgnoreCase("victor")){
                alunos.remove(aluno);
                break;
            }else{
                System.out.println(aluno.toString());
                System.out.println("A média do aluno " + aluno.getNome() + " é " + aluno.getMediaNota());
                System.out.println(aluno.getAlunoAprovado() ? "O aluno está aprovado" : "O aluno está reprovado");
            }
        }
        System.out.println(alunos.toString());
        for(Aluno aluno : alunos){
            System.out.println("Alunos que sobraram na lista");
            System.out.println(aluno.getNome());
            System.out.println("Suas matérias são");
            for(Disciplina disciplina : aluno.getDisciplinas()){
                System.out.println(disciplina.getDisciplina());
            }
        }*/

            } else {
                JOptionPane.showMessageDialog(null, "Credenciais invalidas");
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao processar");
        }

    }
}