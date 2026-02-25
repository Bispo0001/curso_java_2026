package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais.
 */

import java.util.Scanner;

public class Exercicio_11_Crescente {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite dois números:");
        System.out.print("Primeiro número: ");
        valor1 = tc.nextInt();
        System.out.print("Segundo número: ");
        valor2 = tc.nextInt();

        while (valor1 != valor2){
            System.out.println();
            System.out.println("****************************");
            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println("****************************");
            if (valor1 > valor2){
                System.out.println("Decrescente!");
                System.out.println("****************************");
            }else {
                System.out.println("Cresente!");
                System.out.println("****************************");
            }
            System.out.println("Digite dois números:");
            System.out.print("Primeiro número: ");
            valor1 = tc.nextInt();
            System.out.print("Segundo número: ");
            valor2 = tc.nextInt();

        }

    }
}
