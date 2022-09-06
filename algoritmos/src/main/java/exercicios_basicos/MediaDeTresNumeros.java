package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class MediaDeTresNumeros {
    public static void main (String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Double A = sc.nextDouble();
    Double B = sc.nextDouble();
    Double C = sc.nextDouble();

    Double MEDIA = ((A * 2) + (B * 3) + ( C * 5) ) /10;

    System.out.printf("MEDIA = %.1f%n", MEDIA);
    sc.close();

    }
}
