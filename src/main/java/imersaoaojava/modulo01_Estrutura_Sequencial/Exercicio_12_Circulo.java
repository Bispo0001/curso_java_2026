package imersaoaojava.modulo01_Estrutura_Sequencial;

/*
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟ଶ. Você pode
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
diretamente o valor 3.14159.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12_Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = tc.nextDouble();
        area = pi * Math.pow(raio, 2.0);
        System.out.println("***************************************");
        System.out.printf("Área: %.3f%n", area);
        System.out.println("***************************************");
    }
}
