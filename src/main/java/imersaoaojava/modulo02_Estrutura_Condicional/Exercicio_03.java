package imersaoaojava.modulo02_Estrutura_Condicional;

import java.util.Scanner;
/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Digite o primeiro valor inteiro: ");
        valor1 = tc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        valor2 = tc.nextInt();

        if (valor1 > valor2 && valor1 % valor2 == 0){
            System.out.println("São multiplos.");
        }else if (valor1 < valor2 && valor2 % valor1 == 0){
            System.out.println("São multiplos.");
        }else {
            System.out.println("Não são multiplos.");
        }
    }
}
