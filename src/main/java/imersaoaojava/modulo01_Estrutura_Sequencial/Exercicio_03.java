package imersaoaojava.modulo01_Estrutura_Sequencial;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int a, b, c, d;
        int diferenca;

        System.out.print("Digite o valor de 'A': ");
        a = tc.nextInt();
        System.out.print("Digite o valor de 'B': ");
        b = tc.nextInt();
        System.out.print("Digite o valor de 'C': ");
        c = tc.nextInt();
        System.out.print("Digite o valor de 'D': ");
        d = tc.nextInt();
        diferenca = ((a * b) - (c * d));
        System.out.println("A diferença é: " + diferenca);


    }
}
