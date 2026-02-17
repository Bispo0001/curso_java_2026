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
}
