//A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
//Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

package exercicios_basicos;

import java.util.Scanner;
import java.lang.Math;

public class AreadoCírculo {
    public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Double pir =  3.14159;
    Double raio = sc.nextDouble();
    Double area;

    area = (pir) *  Math.pow(raio, 2);

    System.out.print("A="+area);
    sc.close();


    }
}
