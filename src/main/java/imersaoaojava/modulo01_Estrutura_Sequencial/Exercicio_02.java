package imersaoaojava.modulo01_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

public class Exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        System.out.print("Digite o valor do raio: ");
        raio = tc.nextDouble();
        area = pi * Math.pow(raio,2.0);

        System.out.printf("A área do círculo mencionado é %.4f.",area);


    }
}
