package exercicios_basicos;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

        Integer seg = sc.nextInt();

        Integer h = seg/3600;
        Integer min = seg/60;
        Integer qtdSeg = seg%60;

        System.out.println(h +":"+min+":"+qtdSeg);

    }
}




