package imersaoaojava.modulo01_Estrutura_Sequencial;
/*
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08_Retangulo {
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
