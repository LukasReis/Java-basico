package exercicios_basicos;

import java.util.Locale;
import  java.util.Scanner;
import java.lang.Math;

public class Esfera {
    public static void main (String[]args){
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

      Double raio = sc.nextDouble();
      Double pi = 3.14159;
      Double volume = ((4/3.0) * (pi) * (Math.pow(raio,3)));

      System.out.printf("VOLUME = %.3f%n",volume);
      sc.close();

    }
}
