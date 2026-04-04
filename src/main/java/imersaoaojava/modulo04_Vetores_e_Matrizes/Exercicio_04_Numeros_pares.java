package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/

import java.util.Scanner;

public class Exercicio_04_Numeros_pares {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que serão informados: ");
        int qtdNumeros = Integer.parseInt(tc.nextLine());
        if (qtdNumeros <= 0){
            System.out.println("O número informado deverá ser maior que 0 e inteiro.");
        }

        int [] numDigitados = new int[qtdNumeros];
        int qtdMumerosPares = 0;

        for (int i = 0; i < numDigitados.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numDigitados[i] = Integer.parseInt(tc.nextLine());

        }
        System.out.println("\nNúmeros Pares:");
        for (int i = 0; i < numDigitados.length; i++) {

            if (numDigitados[i] % 2 == 0 ) {
                qtdMumerosPares += 1;
                System.out.print(numDigitados[i] + " ");
            }

        }
        System.out.println();
        System.out.println("\nQuantidade de Pares: " + qtdMumerosPares);

    }
}
