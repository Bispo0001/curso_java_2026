package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
impares entre eles.
 */

import java.util.Scanner;

public class Exercicio_19_Soma_Impares {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor1, valor2, maior, menor, soma = 0;

        System.out.print("Digite o primeiro valor: ");
        valor1 = tc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = tc.nextInt();

        if (valor1 < valor2){
            menor = valor1;
            maior = valor2;
        }else {
            menor = valor2;
            maior = valor1;
        }
        for (int i = menor + 1; i < maior; i++){
            if (i % 2 != 0){
                soma +=i;
            }
        }
        System.out.println("Soma dos ímpares = " + soma);


    }
}
