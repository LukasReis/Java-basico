package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class Cordenadas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double x = sc.nextDouble();
        Double y = sc.nextDouble();

        if(x == 0 && y == 0 ){
            System.out.println("Origem");
        } else if(x >= 0.1 && y >= 0.1) {
            System.out.println("Q1");
        } else if(x >= 4.0&& y >= 2.0){
            System.out.println("Q4");
        }



    }
}
