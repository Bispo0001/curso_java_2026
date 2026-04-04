package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

import java.util.Scanner;

public class Exercicio_08_Media_pares {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos do vetor: ");
        int qtdElementos = Integer.parseInt(tc.nextLine());

        int [] vetor = new int[qtdElementos];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = Integer.parseInt(tc.nextLine());
        }
        int aux = 0;
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
               aux += 1;
               soma += vetor[i];

            }

        }
        if (soma == 0) {
            System.out.println("Nenhum número par!");
            return;
        }

        double media = soma / aux;
        System.out.printf("Média dos pares: %.1f",media);
    }
}
