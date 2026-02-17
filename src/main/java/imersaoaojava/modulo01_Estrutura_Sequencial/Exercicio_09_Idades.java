package imersaoaojava.modulo01_Estrutura_Sequencial;

/*
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09_Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double idadeMedia;

        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = tc.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = tc.nextInt();
        tc.nextLine();
        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = tc.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = tc.nextInt();
        System.out.println();
        System.out.println("***********************************************");
        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);
        System.out.println("Dados da segunda pessoa:");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        idadeMedia = (double) (idade1 + idade2) / 2;
        System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + String.format("%.1f", idadeMedia) + " anos");
        System.out.println("***********************************************");




    }
}
