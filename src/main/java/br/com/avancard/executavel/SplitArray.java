package br.com.avancard.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        String texto = "Victor, Curso Java, 8, 9, 10, 10";

        String[] valoresArray = texto.split(","); /* O método split em Java é utilizado para dividir uma string em várias partes com base em um delimitador ou expressão regular (regex). */

       /* for (String valor : valoresArray) {
            System.out.println(valor);
        }
*/
        /* Convertendo um array em uma lista */

        List<String> list = Arrays.asList(valoresArray);

        for (String valorString : list){
            System.out.println(valorString);
        }

        /* Converter uma lista para array */

        String[]conversaoArray = list.toArray(new String[6]);

        System.out.println(Arrays.toString(conversaoArray));
    }
}
