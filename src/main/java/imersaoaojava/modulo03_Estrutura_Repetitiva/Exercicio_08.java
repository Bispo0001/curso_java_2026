package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;
        int fatorial = 1;


        System.out.print("Digite o valor desejado: ");
        valor = tc.nextInt();

            for (int i = valor; i > 1; i--){
               fatorial = fatorial * i;
            }
            System.out.println(fatorial);

    }
}
