package imersaoaojava.modulo01_Estrutura_Sequencial;
/*
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais.

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07_Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double largura, comprimento, valorMetroQuadrado;
        double area, preco;

        System.out.print("Digite a largura do terreno: ");
        largura = tc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = tc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        valorMetroQuadrado = tc.nextDouble();
        area = largura * comprimento;
        preco = valorMetroQuadrado * area;
        System.out.println();
        System.out.println("***********************************");
        System.out.println("Área do terreno: " + String.format("%.2f", area));
        System.out.println("Preço do terreno: " + String.format("%.2f", preco));
        System.out.println("***********************************");
    }

    public static class Exercicio_08_Retangulo {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner tc = new Scanner(System.in);

            double base, altura, area, perimetro, diagonal;

            System.out.print("Digite o valor da base do retângulo: ");
            base = tc.nextDouble();
            System.out.print("Digite o valor da altura do retângulo: ");
            altura = tc.nextDouble();
            area = base * altura;
            perimetro = (2.0 * base) + (2.0 * altura);
            diagonal = (Math.sqrt((Math.pow(base, 2.0) + (Math.pow(altura, 2.0)))));

            System.out.println();
            System.out.println("*********************************************");
            System.out.println("Área: " + String.format("%.4f", area));
            System.out.println("Perímetro: " + String.format("%.4f", perimetro));
            System.out.println("Diagonal: " + String.format("%.4f", diagonal));
            System.out.println("*********************************************");

        }
    }
}
