package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner tc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor inteiro positivo: ");
        valor = tc.nextInt();

        for (int i = 1; i <= 5; i++){
            System.out.println( i + " " + i * i + " " + (int) Math.pow(i,3));
        }

    }
}
