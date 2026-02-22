package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.
 */

import java.util.Scanner;

public class problema_exemplo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;
        int soma = 0;

        System.out.print("Digite um valor inteiro: ");
        valor = tc.nextInt();


        while (valor != 0){
            soma += valor;
            System.out.print("Digite um valor inteiro: ");
            valor = tc.nextInt();
        }
        System.out.println("A soma dos valores digitados é: " + soma);
    }
}
