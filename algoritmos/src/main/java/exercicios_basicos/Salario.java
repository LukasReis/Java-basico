package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Integer number = sc.nextInt();
    Double hours = sc.nextDouble();
    Double value = sc.nextDouble();

    Double calc = (hours) * (value);

    System.out.println("NUMBER = "+number);
    System.out.printf("SALARY = U$ %.2f%n",calc);

    sc.close();

    }
}
