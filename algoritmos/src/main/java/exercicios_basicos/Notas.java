package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

  double valor = sc.nextDouble();
  int nota = 0;

    System.out.println("NOTAS:");
        nota = (int) valor/100;
        valor = valor % 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", nota);

        nota = (int) valor/50;
        valor = valor % 50;
        System.out.printf("%d nota(s) de R$ 50,00%n", nota);

        nota = (int) valor/20;
        valor = valor % 20;
        System.out.printf("%d nota(s) de R$ 20,00%n", nota);

        nota = (int) valor/10;
        valor = valor % 10;
        System.out.printf("%d nota(s) de R$ 10,00%n", nota);

        nota = (int) valor/5;
        valor = valor % 5;
        System.out.printf("%d nota(s) de R$ 5,00%n", nota);

        nota = (int) valor/2;
        System.out.printf("%d nota(s) de R$ 2,00%n", nota);


    System.out.println("MOEDAS:");

        nota = (int) valor/100;
        valor = valor % 100.0;
        System.out.printf("%d moedas(s) de R$ 1.00%n", nota);

        nota = (int) valor/50;
        valor = valor % 50.0;
        System.out.printf("%d moedas(s) de R$ 0.50%n", nota);

        nota = (int) valor/25;
        valor = valor % 25.0;
        System.out.printf("%d moedas(s) de R$ 0.25%n",nota);

        nota = (int)  valor/10;
        valor = valor % 10.0;
        System.out.printf("%d moedas(s) de R$ 0.10%n",nota);

        nota = (int) valor/5;
        valor = valor % 5.0;
        System.out.printf("%d moedas(s) de R$ 0.05%n", nota);

        nota = (int) valor/1;
        System.out.printf("%d moedas(s) de R$ 0.01%n", nota);

    }
}
