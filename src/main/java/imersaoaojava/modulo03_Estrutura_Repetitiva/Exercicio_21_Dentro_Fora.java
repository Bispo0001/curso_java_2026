package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
conforme exemplo
 */

import java.util.Scanner;

public class Exercicio_21_Dentro_Fora {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int qtdNumeros, valor, fora = 0, dentro = 0;

        System.out.print("Quantos números você irá digitar?: ");
        qtdNumeros = tc.nextInt();

        for (int i = 0; i < qtdNumeros; i++){
            System.out.print("Digite um número: ");
            valor = tc.nextInt();
            if (valor >= 10 && valor <= 20){
                dentro = dentro + 1;
            }else {
                fora = fora + 1;
            }

        }
        System.out.println("*************************");
        System.out.println("Dentro: " + dentro);
        System.out.println("Fora: " + fora);
        System.out.println("*************************");
    }
}
