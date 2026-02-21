package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
valor restante conforme exemplo.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_13_Troco_Verificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double precoUnit, valorTotal, valorPago, troco;
        int qtdComprada;

        System.out.print("Digite o preço unitário do produto: ");
        precoUnit = tc.nextDouble();
        System.out.print("Digite a quantidade comprada do produto: ");
        qtdComprada = tc.nextInt();
        valorTotal = precoUnit * qtdComprada;
        System.out.print("Digite o dinheiro recebido: ");
        valorPago = tc.nextDouble();

        if (valorPago >= valorTotal){
            troco = valorPago - valorTotal;
            System.out.println(" Troco: R$" + String.format("%.2f", troco));
        }else {
            troco = valorPago - valorTotal;
            System.out.printf("Dinheiro insuficiente! Falta R$ %.2f",Math.abs(troco));     }

    }
}
