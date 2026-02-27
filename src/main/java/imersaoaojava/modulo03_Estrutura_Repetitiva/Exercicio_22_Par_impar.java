package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
apenas NULO.
 */

import java.util.Scanner;

public class Exercicio_22_Par_impar {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int qtdNumero, valor;

        System.out.print("Quantos números você deseja digitar?: ");
        qtdNumero = tc.nextInt();

        for (int i = 0; i < qtdNumero; i++){
            System.out.print("Digite um número: ");
            valor = tc.nextInt();
            if (valor > 0  && valor % 2 == 0){
                System.out.println("Par Positivo");
            } else if (valor < 0 && valor % 2 == 0) {
                System.out.println("Par Negativo");
            } else if (valor > 0 && valor % 2 != 0) {
                System.out.println("Impar Positivo");
            }else if (valor < 0 && valor % 2 != 0) {
                System.out.println("Impar Negativo");
            }    else {
                System.out.println("Nulo");
            }
            System.out.println("*****************************");
        }
    }
}
