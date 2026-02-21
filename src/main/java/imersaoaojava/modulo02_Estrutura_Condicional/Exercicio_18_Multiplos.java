package imersaoaojava.modulo02_Estrutura_Condicional;

import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
números podem ser digitados em qualquer ordem.
 */
public class Exercicio_18_Multiplos {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Digite o primeiro valor inteiro: ");
        valor1 = tc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        valor2 = tc.nextInt();

        if (valor1 > valor2 && valor1 % valor2 == 0){
            System.out.println("São múltiplos.");
        } else if (valor2 > valor1 && valor2 % valor1 == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }
    }
}
