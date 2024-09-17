package br.com.avancard.executavel;

public class Matriz {
    public static void main(String[] args) {
        //Declarando uma matriz
        int notas[][] = new int[2][3];

        notas[0][0] = 80;
        notas[0][1] = 90;
        notas[0][2] = 70;

        notas[1][0] = 60;
        notas[1][1] = 30;
        notas[1][2] = 90;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Valor da matriz: ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(notas[i][j] + " ");
            }
        }
    }
}
