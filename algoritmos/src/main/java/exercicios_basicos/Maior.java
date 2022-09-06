package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Maior {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int maior =  (A + B + Math.abs(A-B))/2;
    int  maiorQue = (maior + C + Math.abs(maior-C))/2;

    System.out.println(maiorQue+ " eh o maior");
    sc.close();

    }
}
