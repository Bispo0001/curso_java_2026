package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Fazer um programa que lê um valor inteiro N e depois N números inteiros.
Ao final, mostra a soma dos N números lidos
 */

import java.util.Scanner;

public class problema_exemplo_for {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n, soma = 0;

        System.out.print("Digite um valor inteiro de vezes que \n");
        System.out.print("você deseja que os números sejam lidos: ");
        n = tc.nextInt();

        for (int i=0; i < n; i++){
            System.out.print("Digite um número: ");
            int valor = tc.nextInt();
            soma += valor;
        }
        System.out.println("A soma dos " + n + " números lidos é: " + soma);

    }
}
