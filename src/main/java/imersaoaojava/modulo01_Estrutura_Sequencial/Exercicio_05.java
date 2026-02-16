package imersaoaojava.modulo01_Estrutura_Sequencial;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int peca1, peca2, qtdPeca1, qtdPeca2;
        double valorUnitPeca1, valorUnitPeca2, valorTotal;

        System.out.print("Digite o código da peça 1: ");
        peca1 = tc.nextInt();
        System.out.print("Digite a quantidade de peças 1: ");
        qtdPeca1 = tc.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        valorUnitPeca1 = tc.nextDouble();
        System.out.println("***************************************************");
        System.out.print("Digite o código da peça 2: ");
        peca2 = tc.nextInt();
        System.out.print("Digite a quantidade de peças 2: ");
        qtdPeca2 = tc.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        valorUnitPeca2 = tc.nextDouble();
        valorTotal = (qtdPeca1 * valorUnitPeca1) + (qtdPeca2 * valorUnitPeca2);
        System.out.println("***************************************************");
        System.out.println();
        System.out.println("O valor total a pagar é: R$ " + String.format("%.2f", valorTotal));
        System.out.println();
        System.out.println("***************************************************");


    }
}
