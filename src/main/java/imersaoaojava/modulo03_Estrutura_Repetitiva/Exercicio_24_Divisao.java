package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24_Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int qtdCasos;
        double valor1, valor2, divisao;

        System.out.print("Digite a quantidade de repetições: ");
        qtdCasos = tc.nextInt();

        for (int i = 0; i < qtdCasos; i++){
            System.out.print("Digite o numerador: ");
            valor1 = tc.nextDouble();
            System.out.print("Digite o denominador: ");
            valor2 = tc.nextDouble();
            System.out.println("**************************************");

            if (valor2 == 0){
                System.out.println("Divisão impossível!");
                System.out.println("**************************************");
            } else {
                divisao = valor1 / valor2;
                System.out.printf("Divisão = %.2f%n",divisao);
                System.out.println("**************************************");
            }
        }



    }
}
