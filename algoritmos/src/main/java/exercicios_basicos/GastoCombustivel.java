package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Integer temp = sc.nextInt();
    Integer vel = sc.nextInt();

    Double calcLitros = ((temp) * (vel)) /12.0;

    System.out.printf("%.3f%n",calcLitros);
    sc.close();

    }
}

