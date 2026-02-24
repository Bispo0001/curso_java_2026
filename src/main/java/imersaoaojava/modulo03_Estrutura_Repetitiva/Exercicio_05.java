package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int qtd, valor, dentro = 0, fora = 0;

        System.out.print("Digite a quantidade de valores inteiros que serão lidos: ");
        qtd = tc.nextInt();


        for (int i=0; i < qtd; i++){
            System.out.print("Digite o valor desejado: ");
            valor = tc.nextInt();
            if (valor >= 10 && valor <= 20 ){
                dentro +=1;
            }else {
                fora +=1;
            }

        }
        System.out.println("**************************");
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
        System.out.println("**************************");

    }
}
