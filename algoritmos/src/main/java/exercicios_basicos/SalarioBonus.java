package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[]args){
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);


    String employee = sc.next();
    Double salary = sc.nextDouble();
    Double sales = sc.nextDouble();

    Double total = ((sales) * (0.15 ) + (salary));

    System.out.printf("TOTAL = R$ %.2f%n", total);


    }
}