package imersaoaojava.modulo01_Estrutura_Sequencial;

import java.util.Scanner;

/*
Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
números.
 */
public class Exercicio_10_Soma {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int x, y, soma;

        System.out.print("Digite o valor de X: ");
        x = tc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = tc.nextInt();
        soma = x + y;
        System.out.println("**********************************************");
        System.out.println("A soma entre " + x + " e " + y + " é: " + soma);
        System.out.println("**********************************************");


    }
}
