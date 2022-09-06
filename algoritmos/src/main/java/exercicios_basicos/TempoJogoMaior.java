package exercicios_basicos;

import java.util.Scanner;

public class TempoJogoMaior {

    public static void main(String[] agrs ){
        Scanner sc = new Scanner(System.in);

        Integer hI = sc.nextInt();
        Integer hF = sc.nextInt();
        Integer mI = sc.nextInt();
        Integer mF = sc.nextInt();
        Integer duracaoH;
        Integer duracaoMin;

        if(hI >= hF){
            duracaoH = (24 + hF) - hI;
        } else {
            duracaoH = hF - hI;
        }

        if(mI >= mF){
            duracaoMin = (60 + mF) - mI;
        } else {
            duracaoMin = mI - mF;
        }

            System.out.print("O JOGO DUROU "+ duracaoH + " HORA(S) E " + duracaoMin + " MINUTO(S)");

        sc.close();
    }
}




