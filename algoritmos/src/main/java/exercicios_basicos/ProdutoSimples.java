//Ler dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD
//mostre a variável PROD com mensagem correspondente.

package exercicios_basicos;

import java.util.Scanner;
import java.util.Locale;

public class ProdutoSimples {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Integer A = sc.nextInt();
    Integer B = sc.nextInt();
    Integer PROD;

    PROD = (A)*(B);

    System.out.println("PROD = " + PROD);
    sc.close();


    }

}
