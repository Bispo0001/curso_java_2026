package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int qtd;
        double valor1, valor2, divisao;

        System.out.print("Digite a quantidade de pares a serem lidos: ");
        qtd = tc.nextInt();

        for (int i=0; i<qtd; i++){
            System.out.println((i+1)+"º conjunto de pares:");
            System.out.print("Digite o primeiro valor: ");
            valor1 = tc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            valor2 = tc.nextDouble();
            if (valor2 == 0){
                System.out.println("Divisão impossível.");
            }else {
                divisao = valor1/valor2;
                System.out.println(divisao);
            }

        }
    }
}
