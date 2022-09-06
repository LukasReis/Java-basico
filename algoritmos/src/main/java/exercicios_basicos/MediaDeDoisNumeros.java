//Ler 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 s de um aluno.
package exercicios_basicos;

import java.util.Scanner;
import java.util.Locale;

public class MediaDeDoisNumeros {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        Double MEDIA = ((A * 3.5) + (B * 7.5) ) /11;

        System.out.printf("MEDIA = %.5f%n", MEDIA);
        sc.close();

    }
}
