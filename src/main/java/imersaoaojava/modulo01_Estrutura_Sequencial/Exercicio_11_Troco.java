package imersaoaojava.modulo01_Estrutura_Sequencial;

/*
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11_Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double precoUnit, valorPago, troco, valorCompra;
        int qtdComprada;

        System.out.print("Digite o preço unitário do produto: ");
        precoUnit = tc.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        qtdComprada = tc.nextInt();
        System.out.print("Qual o valor em dinheiro recebido para o pagamento: ");
        valorPago = tc.nextDouble();
        valorCompra = precoUnit * qtdComprada;
        troco = valorPago - valorCompra;
        System.out.println("*************************************");
        System.out.printf("Troco: R$ %.2f%n", troco);
        System.out.println("*************************************");
    }
}
