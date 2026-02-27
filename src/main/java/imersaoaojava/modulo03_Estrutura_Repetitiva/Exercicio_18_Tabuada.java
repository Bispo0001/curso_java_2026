package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.
 */

import java.util.Scanner;

public class Exercicio_18_Tabuada {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;

        System.out.print("Deseja a tabuada para qual valor?: ");
        valor = tc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

    }
}
