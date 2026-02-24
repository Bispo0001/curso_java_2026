package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor, impares;

        System.out.print("Digite um valor inteiro (1 <= X <= 1000): ");
        valor = tc.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
