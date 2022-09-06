package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno{

    public static void main (String[]args) {

        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);

        Double N1 = sc.nextDouble ();
        Double N2 = sc.nextDouble ();
        Double N3 = sc.nextDouble ();
        Double N4 = sc.nextDouble ();

        Double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if (media >= 7.0) {

            System.out.printf ("Media: %.1f%n", media);
            System.out.print ("Aluno aprovado.");

        }
        else if (media < 5){

            System.out.printf ("Media:  %.1f%n", media);
            System.out.println ("Aluno reprovado.");
        }
        else {

            System.out.printf ("Media:  %.1f%n", media);
            System.out.println ("Aluno em exame.");
            Double N5 = sc.nextDouble ();
            System.out.printf ("Nota do exame:  %.1f%n", N5);
            Double mediaFinal = ((media) + (N5)) / 2;
            if (mediaFinal >= 5.0) {

                System.out.print ("Aluno aprovado.");
                System.out.printf ("Media final:   %.1f%n", mediaFinal);
            }
            else if (mediaFinal <= 4.9) {

                System.out.println ("Aluno reprovado.");
                System.out.printf ("Media final:   %.1f%n", mediaFinal);
            }


        }

        sc.close ();
    }

}


