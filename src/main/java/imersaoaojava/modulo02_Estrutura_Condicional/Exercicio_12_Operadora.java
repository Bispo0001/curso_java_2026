package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 */

import java.util.Scanner;

public class Exercicio_12_Operadora {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int qtdMinutos;
        double valorPagar;

        System.out.print("Digite a quantidade de minutos utilizados: ");
        qtdMinutos = tc.nextInt();

        if (qtdMinutos > 100){
            valorPagar = ((qtdMinutos - 100) * 2.00) + 50.00;
            System.out.println("Valor a pagar: R$ " + String.format("%.2f",valorPagar));
        } else  {
            valorPagar = 50.00;
            System.out.println("Valor a pagar: R$ " + String.format("%.2f",valorPagar));
        }
    }
}
