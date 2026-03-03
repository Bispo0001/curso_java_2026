package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*
Fazer um programa para ler um número inteiro positivo N (máximo = 10), depois ler
N números quaisquer e armazená-los em um vetor. Em seguida, mostrar na tela
todos elementos do vetor.
 */

import java.util.Locale;
import java.util.Scanner;

public class Problema_Exemplo_00 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int valor;


        System.out.print("Digite a quantidade de números: ");
        valor = tc.nextInt();
        double[] vetor = new double[valor];

        for (int i = 0; i < valor; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = tc.nextDouble();
        }
        System.out.println("*****************************");
        System.out.println("Números Digitados: ");
        for (int j = 0; j < valor; j++ ){
            System.out.println(vetor[j]);
        }


    }
}
