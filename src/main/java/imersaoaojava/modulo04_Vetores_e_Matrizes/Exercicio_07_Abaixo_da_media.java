package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07_Abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos do vetor: ");
        int qtdElementos = Integer.parseInt(tc.nextLine());
        if (qtdElementos <= 0){
            System.out.println("Digite um número inteiro maior que 0.");
            return;
        }
        double soma = 0;
        double [] vetNumReais = new double[qtdElementos];
        for (int i = 0; i < vetNumReais.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetNumReais[i] = Double.parseDouble(tc.nextLine());
            soma += vetNumReais[i];
        }
        double media = soma/qtdElementos;
        System.out.printf("Média do vetor: %.3f",media);

        System.out.println("\nElementos abaixo da média: ");
        for (int i = 0; i < vetNumReais.length; i++) {
            if (vetNumReais[i] < media) {
                System.out.println(vetNumReais[i]);
            }
        }

    }
}
