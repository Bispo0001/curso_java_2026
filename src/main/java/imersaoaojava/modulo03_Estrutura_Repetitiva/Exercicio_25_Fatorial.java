package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
fatorial de N.
 */

import java.util.Scanner;

public class Exercicio_25_Fatorial {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor, fatorial = 1;

        System.out.print("Digite o valor de N (máximo: 15): ");
        valor = tc.nextInt();

        for (int i = 1; i <= valor; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);






    }

}
