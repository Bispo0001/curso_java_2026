package imersaoaojava.modulo01_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C
 */
public class Exercicio_15_Medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double a, b, c, areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.print("Digite a medida A: ");
        a = tc.nextDouble();
        System.out.print("Digite a medida B: ");
        b = tc.nextDouble();
        System.out.print("Digite a medida C: ");
        c = tc.nextDouble();

        areaQuadrado = a * a;
        areaTriangulo = (a * b) / 2;
        areaTrapezio = (a + b) * c / 2;

        System.out.println("******************************************");
        System.out.printf("Área do quadrado: %.4f%n", areaQuadrado);
        System.out.printf("Área do triângulo: %.4f%n", areaTriangulo);
        System.out.printf("Área do trapezio: %.4f%n", areaTrapezio);
        System.out.println("******************************************");
    }
}
