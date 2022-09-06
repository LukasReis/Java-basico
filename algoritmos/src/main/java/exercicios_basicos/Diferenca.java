package exercicios_basicos;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    Integer A = sc.nextInt();
    Integer B = sc.nextInt();
    Integer C = sc.nextInt();
    Integer D = sc.nextInt();

    Integer DIFERENCA = (A * B) - (C* D);

    System.out.println("DIFERENCA = "+ DIFERENCA);
    sc.close();


    }

}
