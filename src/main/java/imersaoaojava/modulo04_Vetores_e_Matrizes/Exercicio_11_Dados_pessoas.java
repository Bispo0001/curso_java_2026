package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11_Dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int qtdPessoas = Integer.parseInt(tc.nextLine());
        if (qtdPessoas < 0) {
            System.out.println("Digite um valor inteiro e positivo!");
            return;
        }

        double[] vetAltura = new double[qtdPessoas];
        char[] vetGenero = new char[qtdPessoas];


        for (int i = 0; i < vetGenero.length; i++) {
            System.out.println("Dados da "+ (i+1) + "ª pessoa:");
            System.out.print("Altura: ");
            vetAltura[i] = tc.nextDouble();
            System.out.print("Gênero: ");
            vetGenero[i] = tc.next().charAt(0);
        }
        double maiorAltura = vetAltura[0];
        double menorAltura = vetAltura[0];

        for (int i = 0; i < vetAltura.length; i++) {
            if (vetAltura[i] > maiorAltura) {
                maiorAltura = vetAltura[i];


            } else if (vetAltura[i] < menorAltura) {
                menorAltura = vetAltura[i];

            }
        }
        System.out.printf("\nMaior altura: %.2f metros.\n", maiorAltura);
        System.out.printf("\nMenor altura: %.2f metros.\n", menorAltura);

        double mediaAlturaMulheres = vetAltura[0];
        double soma = 0;
        double j = 0;
        for (int i = 0; i < vetGenero.length; i++) {
            if (vetGenero[i] == 'F') {
                soma += vetAltura[i];
                j++;
            }
            mediaAlturaMulheres = soma / j;
        }
        System.out.println();
        System.out.printf("Média das alturas das mulheres: %.2f metros\n",mediaAlturaMulheres);

        int qtdHomens = 0;
        for (int i = 0; i < vetGenero.length; i++) {
            if (vetGenero[i] == 'M') {
                qtdHomens += 1;
            }
        }
        System.out.println("Quantidade de homens: " + qtdHomens);
    }
}
