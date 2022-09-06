//Ler 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo
//o seu resultado na variável X. Imprima X
package exercicios_basicos;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Integer a = sc.nextInt();
    Integer b = sc.nextInt(); ;
    Integer soma;

    soma = (a) + (b);
    System.out.print("X = "+soma);
    sc.close();

    }
}
