package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Integer X = sc.nextInt();
    Double Y = sc.nextDouble();

    Double consumo = (X)/(Y);

    System.out.printf("%.3f km/l%n",consumo);

    }
}
