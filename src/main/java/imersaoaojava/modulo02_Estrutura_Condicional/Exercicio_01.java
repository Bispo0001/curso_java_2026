package imersaoaojava.modulo02_Estrutura_Condicional;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor inteiro, positivo ou negativo: ");
        valor = tc.nextInt();
        System.out.println("*****************************************************");
        if (valor < 0){
            System.out.println("Número digitado '" + valor + "' é negativo." );
        } else {
            System.out.println("Número digitado '" + valor + "' é positivo." );
        }
        System.out.println("*****************************************************");
    }

}
