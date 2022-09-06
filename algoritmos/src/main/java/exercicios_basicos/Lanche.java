package exercicios_basicos;

import java.util.Scanner;

public class Lanche {
    public static void  main (String[] args){
    Scanner sc = new Scanner (System.in);

    Integer codigo = sc.nextInt();
    Double quantidade = sc.nextDouble();
    Double valor;

        if(codigo == 1){
          valor = quantidade * 4;
           System.out.print("Total: R$ "+valor);

        } else if(codigo == 2){
            valor = quantidade * 4.50;
            System.out.print("Total: R$ "+valor);
        } else if(codigo == 3){
            valor = quantidade * 5;
            System.out.print("Total: R$ "+valor);
        } else if(codigo == 4){
            valor = quantidade * 2;
            System.out.print("Total: R$ "+valor);
        } else {
            valor = quantidade * 1.50;
            System.out.print("Total: R$ "+valor);
        }

    }
}
