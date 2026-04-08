package imersaoaojava.modulo04_Vetores_e_Matrizes;
/*
Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
 lucro < 10%
 10% ≤ lucro ≤ 20%
 lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12_Comerciante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int qtdProdutos = Integer.parseInt(tc.nextLine());

        String[] produtosInformados = new String[qtdProdutos];
        double[] precoCompra = new double[qtdProdutos];
        double[] precoVenda = new double[qtdProdutos];

        for (int i = 0; i < produtosInformados.length; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");
            System.out.print("Nome: ");
            produtosInformados[i] = tc.nextLine();
            System.out.print("Preço de compra: ");
            precoCompra[i] = Double.parseDouble(tc.nextLine());
            System.out.print("Preço de venda: ");
            precoVenda[i] = Double.parseDouble(tc.nextLine());

        }

        int abaixo10 = 0;
        int entre10e20 = 0;
        int acima20 = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        double lucroTotal = 0;

        for (int i = 0; i < precoCompra.length; i++) {
            double lucroPercentual = ((precoVenda[i] - precoCompra[i]) / precoCompra[i] * 100);

            if (lucroPercentual < 10) {
                abaixo10 ++;
            } else if (lucroPercentual <= 20) {
                entre10e20 ++;
            } else {
                acima20 ++;
            }
            valorTotalCompra += precoCompra[i];
            valorTotalVenda += precoVenda[i];
        }
        lucroTotal = valorTotalVenda - valorTotalCompra;

        System.out.println("***************RELATÓRIO***************");
        System.out.println("Lucro abaixo de 10%: " + abaixo10);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Lucro acima de 20%: " + acima20);
        System.out.printf("Valor total de compra: R$%.2f\n", valorTotalCompra);
        System.out.printf("Valor total de venda: R$%.2f\n", valorTotalVenda);
        System.out.printf("Lucro total:: R$%.2f\n", lucroTotal);
    }
}
