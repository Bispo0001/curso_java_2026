package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
se for o caso.
 */

import java.util.Scanner;

public class Exercicio_20_Sequencia_Impares {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor inteiro: ");
        valor = tc.nextInt();

        for (int i = 1; i <= valor; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
