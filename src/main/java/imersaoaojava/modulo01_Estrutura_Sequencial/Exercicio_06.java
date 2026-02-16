package imersaoaojava.modulo01_Estrutura_Sequencial;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        System.out.print("Digite o valor de 'A': ");
        a = tc.nextDouble();
        System.out.print("Digite o valor de 'B': ");
        b = tc.nextDouble();
        System.out.print("Digite o valor de 'C': ");
        c = tc.nextDouble();

        areaTriangulo = a * c / 2;
        areaCirculo = pi * Math.pow(c,2.0);
        areaTrapezio = (a + b) * c / 2;
        areaQuadrado = Math.pow(b, 2.0);
        areaRetangulo = a * b;
        System.out.println("*******************************************************");
        System.out.println();
        System.out.printf("Triângulo: %.3f", areaTriangulo);
        System.out.printf("%nCírculo: %.3f", areaCirculo);
        System.out.printf("%nTrapezio: %.3f", areaTrapezio);
        System.out.printf("%nQuadrado: %.3f", areaQuadrado);
        System.out.printf("%nRetângulo: %.3f", areaRetangulo);
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************");

    }
}
