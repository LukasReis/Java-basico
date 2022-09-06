/*

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule
o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

 */

package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args ){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    Double A = sc.nextDouble();
    Double B = sc.nextDouble();
    Double C = sc.nextDouble();

    Double perimetro;
    Double area;

    if(A+B > C && (B+C) > A && (A+C) > B ){
      perimetro = A+B+C;
      System.out.printf("Perimetro = %.1f%n", perimetro);
    } else {
        area = (A+B)*C/2;
        System.out.printf("Area = %.1f%n", area);
    }

    sc.close();

    }

}
