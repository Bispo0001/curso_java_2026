package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

import java.util.Scanner;

public class Exercicio_06_Soma_vetores {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números dos vetores: ");
        int qtdNumeros = Integer.parseInt(tc.nextLine());

        int[] vetorA = new int[qtdNumeros];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetorA[i] = Integer.parseInt(tc.nextLine());
        }
        int[] vetorB = new int[qtdNumeros];
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetorB[i] = Integer.parseInt(tc.nextLine());
        }
        int[] vetorC = new int[qtdNumeros];
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = (vetorA[i] + vetorB[i]);
        }
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i]);
        }
    }
}
