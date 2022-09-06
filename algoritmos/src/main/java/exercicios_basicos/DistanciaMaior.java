package exercicios_basicos;

import java.util.Scanner;

public class DistanciaMaior {
    public static void main(String[] args ){
    Scanner sc  = new Scanner(System.in);

    Integer km = sc.nextInt();
    Integer qtdMinutos = (60 * km)/30;

    System.out.println(qtdMinutos + " minutos");

    sc.close();

    }
}
