package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

import java.util.Scanner;

public class Exercicio_01_Negativos {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int quantidade;

        System.out.print("Quantos números serão digitados: ");
        quantidade = tc.nextInt();
        if (quantidade > 10) {
            System.out.println("Valor máximo permitido é 10.");
            return;
        }

            int [] numeros = new int [quantidade];

            for (int i = 0; i < quantidade; i++){
                System.out.print("Digite o " + (i+1) + "º número: ");
                numeros[i] = tc.nextInt();
            }
            System.out.println("***************************************");
            System.out.println("NÚMEROS NEGATIVOS:");

            boolean temNegativo = false;

            for (int j = 0; j < numeros.length; j++){
                if (numeros[j] < 0){
                    System.out.println(numeros[j]);
                    temNegativo = true;
                }

            }
            if (!temNegativo){
            System.out.println("Nenhum número negativo foi digitado.");
        }

        }
}
