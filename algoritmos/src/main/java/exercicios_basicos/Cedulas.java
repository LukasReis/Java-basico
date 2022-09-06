package exercicios_basicos;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[]args){
    Scanner sc = new  Scanner(System.in);

    Integer val = sc.nextInt();


        System.out.println(""+val);

        System.out.println(val/100 + " (s) de R$ 100,00"); //val divido por cem, que da x
        val = val % 100; //resto da divisão entre val e cem que da Y

        System.out.println(val/50 + " (s) de R$ 50,00"); // Y divido por cinquenta que da X1.
        val = val % 50; // Resto da divisão entre X1 e cinquenta que da Y2

        System.out.println(val/20 + " (s) de R$ 20,00"); // Y2 divido por vinte que da X2.
        val = val % 20; //Resto da divisão entre X2 e cinquenta que da Y3

        System.out.println(val/10 + " (s) de R$ 10,00"); // Y3 divido por dez que da X3.
        val = val % 10; //Resto da divisão entre X3 e dez que da Y4

        System.out.println(val/5 + " (s) de R$ 5,00"); // Y4 divido por cinco que da X4.
        val = val %  5;  //Resto da divisão entre X4 e dez que da Y5

        System.out.println(val/2 + " (s) de R$ 2,00"); // Y5 divido por dois que da X5.
        val = val % 2; //Resto da divisão entre X5 e dez que da Y6

        System.out.println(val/1 + " (s) de R$ 1,00"); // Y5 divido por dois que da X6.

         sc.close();

    }

}
