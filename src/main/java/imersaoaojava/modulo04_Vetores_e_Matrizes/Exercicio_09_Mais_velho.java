package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

import java.util.Scanner;

public class Exercicio_09_Mais_velho {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int qtdPessoas = Integer.parseInt(tc.nextLine());
        if (qtdPessoas <= 0) {
            System.out.println("Digite um vaor inteiro e positivo!");
            return;
        }

        String[] vetNomes = new String[qtdPessoas];
        int[] vetIdades = new  int[qtdPessoas];
        for (int i = 0; i < vetNomes.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa:");
            System.out.print("Nome: ");
            vetNomes[i] = tc.nextLine();
            System.out.print("Idade: ");
            vetIdades[i] = Integer.parseInt(tc.nextLine());
        }
        int maisVelho = vetIdades[0];
        String pessoaMaisVelha = null;
        for (int i = 0; i < vetIdades.length; i++) {
            if (vetIdades[i] > maisVelho) {
                maisVelho = vetIdades[i];
                pessoaMaisVelha = vetNomes[i];

            }

        }
        System.out.println("Pessoa mais velha: " + pessoaMaisVelha);

    }
}
