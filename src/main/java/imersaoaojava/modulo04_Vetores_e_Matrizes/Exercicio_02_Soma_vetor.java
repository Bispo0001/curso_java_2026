package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02_Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int quantidade;


        System.out.print("Quantos números serão digitados: ");
        quantidade = tc.nextInt();

        double [] numeros = new double[quantidade];
        for (int i = 0; i < quantidade; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = tc.nextDouble();
        }
        System.out.print("Valores digitados: ");
        for (int j = 0; j < numeros.length; j++){
            System.out.print(numeros[j] + "  "  );
        }
        System.out.print("\nSoma dos valores digitados: ");
        double soma = 0;
        for (int j = 0; j < numeros.length; j++) {
            soma += numeros[j];
        }System.out.printf("%.2f",soma);

        System.out.print("\nMédia dos valores digitados: ");
        double media = soma / quantidade;
        System.out.printf("%.2f",media);

    }
}
