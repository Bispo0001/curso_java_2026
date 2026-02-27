package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X
for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X
, se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação:
4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a
soma de 12+14+16+18+20.
 */

import java.util.Scanner;

public class Exercicio_17_Pares_Consecutivos {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor, soma;

        System.out.print("Digite um numero inteiro:");
        valor = tc.nextInt();

        while (valor != 0){
            if (valor % 2 == 0){
                soma = (valor * 5) + 20;
                System.out.println("Soma = " + soma);
                System.out.println("***********************");
                System.out.print("Digite um numero inteiro:");
                valor = tc.nextInt();
            }else {
                soma = ((valor+1) * 5 + 20);
                System.out.println("Soma = " + soma);
                System.out.println("***********************");
                System.out.print("Digite um numero inteiro:");
                valor = tc.nextInt();
            }
        }
    }
}
