package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int senha= 2002, valorDigitado;

        System.out.print("Favor, digite a senha: ");
        valorDigitado = tc.nextInt();

        while (valorDigitado != senha){
            System.out.println("Senha inválida!");
            System.out.print("Favor, digite a senha: ");
            valorDigitado = tc.nextInt();
        }
        System.out.println("Acesso Permitido!");
    }
}
