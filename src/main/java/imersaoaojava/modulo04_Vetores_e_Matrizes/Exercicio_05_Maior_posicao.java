package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05_Maior_posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que serão informados: ");
        int qtdNumeros = Integer.parseInt(tc.nextLine());

        double [] numInformados = new double[qtdNumeros];

        for (int i = 0; i < numInformados.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numInformados[i] = Double.parseDouble(tc.nextLine());
        }
        double maiorValor = numInformados[0];
        int posMaiorValor = 0;

        for (int j = 0; j < numInformados.length; j++){
            if (numInformados[j] > maiorValor){
                maiorValor = numInformados[j];
                posMaiorValor = j;
            }
        }
        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("\nPosição do Maior valor: " + posMaiorValor);

    }
}
