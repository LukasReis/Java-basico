package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class TipoTriangulos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double aux;
        Double a2;
        Double bc;

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();
        Double C = sc.nextDouble();

        if (B > A){
            aux = A;
            A = B;
            B = aux;
        }

        if (C > A){
            aux = A;
            A = C;
            C = aux;
        }

        a2 = Math.pow(A,2);
        bc = Math.pow(B,2) + Math.pow(C,2);

        if(A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {

            if(a2 > bc){
                System.out.println(" TRIANGULO OBTUSANGULO");
            } else if (a2 < bc){
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }

            if(A == B && B == C){
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        }
    }
}



