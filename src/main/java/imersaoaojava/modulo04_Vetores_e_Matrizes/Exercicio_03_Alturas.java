package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03_Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int qtdPessoas = Integer.parseInt(tc.nextLine());

        String[] nomes = new String[qtdPessoas];
        int[] idades = new int[qtdPessoas];
        double[] alturas = new double[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++){
            System.out.println("\nDados da " + (i+1) + "ª pessoa:");

            System.out.print("Nome: ");
            nomes[i] = tc.nextLine();

            System.out.print("Idade: ");
            idades[i] = Integer.parseInt(tc.nextLine());

            System.out.print("Altura: ");
            alturas[i] = Double.parseDouble(tc.nextLine());

        }
        double somaAlturas = 0;
        int qtdMenores16 = 0;

        for (int i = 0; i < idades.length; i++) {
            somaAlturas += alturas[i];

            if (idades[i] < 16) {
                qtdMenores16++;
            }

        }
        double mediaAlturas = somaAlturas / qtdPessoas;
        double porcentagem = (qtdMenores16 * 100.0) / idades.length;

        System.out.printf("\nAltura média: %.2f m%n", mediaAlturas);
        System.out.printf("Menores de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

    }
}

