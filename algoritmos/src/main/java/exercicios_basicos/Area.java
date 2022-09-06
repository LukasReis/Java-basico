package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Double A = sc.nextDouble();
    Double B = sc.nextDouble();
    Double C = sc.nextDouble();
    Double PI = 3.14159;

    Double trianguloRetangulo = ((A) * (C))/2;
    Double circulo =  (PI) * (Math.pow(C,2));
    Double trapezio = ((A+B) * (C))/2;
    Double quadrado = Math.pow(B,2);
    Double retangulo = (A) * (B);

    System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
    System.out.printf("CIRCULO:  %.3f%n", circulo);
    System.out.printf("TRAPEZIO: %.3f%n", trapezio);
    System.out.printf("QUADRADO: %.3f%n", quadrado);
    System.out.printf("RETANGULO: %.3f%n", retangulo);

    sc.close();

    }
}
