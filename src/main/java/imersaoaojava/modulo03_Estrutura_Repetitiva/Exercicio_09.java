package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Ler um número inteiro N e calcular todos os seus divisores.
 */

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor inteiro: ");
        valor = tc.nextInt();

            for (int i = 1; i <= valor; i++){
            if (valor % i == 0){
                System.out.println(i);
            }

        }
    }
}
