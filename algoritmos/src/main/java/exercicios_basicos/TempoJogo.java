package exercicios_basicos;

import java.util.Scanner;

public class TempoJogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer h1 = sc.nextInt();
        Integer h2 = sc.nextInt();
        Integer duracao;

        if(h1 >= h2){
            duracao = (24 + h2) - h1;
        } else  {
            duracao = h1 - h2;
        }


        System.out.print("O JOGO DUROU " + duracao + " HORA(S)");


    }
}
