package exercicios_basicos;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    Integer qtdDias = sc.nextInt();

    Integer anos = qtdDias / 365;
    Integer meses = qtdDias / 30;
    Integer dias = qtdDias % 30;

    System.out.println(anos);
    System.out.println(meses);
    System.out.println(dias);



    }
}
