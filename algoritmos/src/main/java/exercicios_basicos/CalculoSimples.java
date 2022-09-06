package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Integer codRoupa = sc.nextInt();
    Integer quantiRoupa = sc.nextInt();
    Double valRoupa = sc.nextDouble();

    Integer codRoupa2 = sc.nextInt();
    Integer quantiRoupa2 = sc.nextInt();
    Double valRoupa2 = sc.nextDouble();

    Double total =  ((quantiRoupa*valRoupa) + (quantiRoupa2*valRoupa2));

    System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);

    }
}
