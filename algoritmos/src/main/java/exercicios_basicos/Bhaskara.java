package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

          Double delta = Math.pow(B,2) - (4*A*C);

            if( A == 0 || delta < 0){
                System.out.print("Impossivel calcular");

            } else {

                Double raiz1 = ( - B + Math.sqrt(delta))/ (2*A);
                Double raiz2 = ( - B - Math.sqrt(delta))/ (2*A);
                System.out.printf("R1 = %.5f\n",raiz1);
                System.out.printf("R2 = %.5f\n",raiz2);

            }
    }
}
