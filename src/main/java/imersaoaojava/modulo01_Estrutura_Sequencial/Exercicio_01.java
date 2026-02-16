package imersaoaojava.modulo01_Estrutura_Sequencial;

import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor1, valor2, soma;

        System.out.print("Digite o primeiro valor inteiro: ");
        valor1 = tc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        valor2 = tc.nextInt();
        soma = valor1 + valor2;

        System.out.println("O valor da soma entre " + valor1 + " e " + valor2 + " é: " + soma + ".");


    }
}
