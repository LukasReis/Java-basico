package exercicios_basicos;

import java.util.Scanner;
import java.lang.Math;


public class TiposTriangulo {
    public static void main (String[]args) {

        Scanner sc = new Scanner (System.in);

        Double A = sc.nextDouble ();
        Double B = sc.nextDouble ();
        Double C = sc.nextDouble ();

        Double max = Math.max(A, Math.max(B,C));


        if(A >= B+C ){
            System.out.println("NAO FORMA TRIANGULO");
        } if(Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2) ) {
            System.out.println("TRIANGULO RETANGULO");
        } if(Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } if(Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2) ){

        }

    }




//
//        sc.close ();

    }
