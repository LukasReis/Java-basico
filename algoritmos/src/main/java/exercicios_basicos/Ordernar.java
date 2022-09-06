/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente,
uma linha em branco e em seguida, os valores na sequência como foram lidos.

Exemplo de Entrada: 	Exemplo de Saída

7 21 -14                -14
                         7
                        21

                        7
                        21
                       -14


 */


package exercicios_basicos;

import java.util.Scanner;
import java.lang.Math;

public class Ordernar {

    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);

        Integer a = sc.nextInt (); // vai ter um valor
        Integer b = sc.nextInt (); // vai ter um valor
        Integer c = sc.nextInt (); // vai ter um valor

        Integer min = Math.min(a,Math.min(b,c)); // vai retornar o menor valor

        int min2 = 0;
        int min3 = 0;

        if (min == a) {
            min2 = Math.min(b,c);
            min3 = Math.max(b,c);

        }
        if (min == b) {
            min2 = Math.min(a,c);
            min3 = Math.max(a,c);

        }
        if (min == c) {
            min2 = Math.min (a, b);
            min3 = Math.max (a, b);

        }

        System.out.println (min);
        System.out.println (min2);
        System.out.println (min3);

        System.out.println ("");
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);

    }
}
