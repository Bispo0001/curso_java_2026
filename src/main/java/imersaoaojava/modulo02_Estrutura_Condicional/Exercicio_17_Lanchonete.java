package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Uma lanchonete possui vários produtos. Cada produto possui um código
e um preço. Você deve fazer um programa para ler o código e a
quantidade comprada de um produto (suponha um código válido), e daí
informar qual o valor a ser pago, com duas casas decimais, conforme
tabela de produtos ao lado.
+-------------------+------------------+
| Código do produto | Preço do produto |
+-------------------+------------------+
| 1                 | R$ 5.00         |
| 2                 | R$ 3.50         |
| 3                 | R$ 4.80         |
| 4                 | R$ 8.90         |
| 5                 | R$ 7.32         |
+-------------------+------------------+
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_17_Lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double preco, valorTotal;
        int codigo, qtd;

        System.out.print("Digite o código do produto comprado: ");
        codigo = tc.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        qtd = tc.nextInt();

        if (codigo == 1){
            preco = 5.00;
            valorTotal = preco * qtd;
            System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorTotal));
        } else if (codigo == 2){
            preco = 3.50;
            valorTotal = preco * qtd;
            System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorTotal));
        }else if (codigo == 3){
            preco = 4.80;
            valorTotal = preco * qtd;
            System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorTotal));
        }else if (codigo == 4){
            preco = 8.90;
            valorTotal = preco * qtd;
            System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorTotal));
        }else if (codigo == 5){
            preco = 7.32;
            valorTotal = preco * qtd;
            System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorTotal));
        }else {
            System.out.println("Código Inválido!");
        }

    }
}
