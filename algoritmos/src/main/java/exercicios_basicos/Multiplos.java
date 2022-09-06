package exercicios_basicos;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        Double divisao;

        if ((A % B) == 0 || (B % A) == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();

        }
    }
