package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

CODIGO | ESPECIFICACAO     | PRECO
1      | Cachorro Quente   | R$ 4.00
2      | X-Salada          | R$ 4.50
3      | X-Bacon           | R$ 5.00
4      | Torrada simples   | R$ 2.00
5      | Refrigerante      | R$ 1.50
 */

import java.text.Format;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int codigo, qtd;
        double valorTotal;

        System.out.print("Digite o código do item desejado: ");
        codigo = tc.nextInt();
        System.out.print("Digite a quantidade de itens desejado: ");
        qtd = tc.nextInt();

        if (codigo == 1){
            valorTotal = 4.00 * qtd;
            System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));
        }else if (codigo == 2) {
            valorTotal = 4.50 * qtd;
            System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));
        } else if (codigo == 3){
            valorTotal = 5.00 * qtd;
            System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));
        } else if (codigo == 4){
            valorTotal = 2.00 * qtd;
            System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));
        } else if (codigo == 5){
            valorTotal = 1.50 * qtd;
            System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));

        }else {
            System.out.println("Código inválido!");
        }
    }
}
