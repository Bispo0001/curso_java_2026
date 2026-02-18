package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor inteiro: ");
        valor = tc.nextInt();

        System.out.println("********************************************");
        if (valor % 2 != 0){
            System.out.println("Número digitado: " + valor + " é ímpar");
        } else {
            System.out.println("Número digitado: " + valor + " é par");
        }
        System.out.println("********************************************");
    }
}
