package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
números lidos. Em caso de empate, mostrar apenas uma vez.
 */

import java.util.Scanner;

public class Exercicio_11_Menor_de_tres {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor1, valor2, valor3, menor;

        System.out.print("Digite o primeiro valor: ");
        valor1 = tc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = tc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = tc.nextInt();

        if (valor1 <= valor2 && valor1 <= valor3){
            System.out.println("Valor: " + valor1 + " é o menor");
        } else if (valor2 <= valor3) {
            System.out.println("Valor: " + valor2 + " é o menor");
        }else {
            System.out.println("Valor: " + valor3 + " é o menor");
        }

    }
}
