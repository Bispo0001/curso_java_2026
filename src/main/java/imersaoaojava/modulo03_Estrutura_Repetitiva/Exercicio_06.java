package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int qtd;
        double valor1, valor2, valor3, media;

        System.out.print("Digite a quantidade de testes que serão feitos: ");
        qtd = tc.nextInt();
        System.out.println("OBS: Valores com apenas uma casa decimal!");

        for (int i=0; i < qtd; i++){
            System.out.println("Iniciando o teste " + (i+1));

            System.out.print("Digite o primeiro valor: ");
            valor1 = tc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            valor2 = tc.nextDouble();
            System.out.print("Digite o terceiro valor: ");
            valor3 = tc.nextDouble();
            media = (((valor1*2)+(valor2*3)+(valor3*5))/(2+3+5));
            System.out.println("Média " + (1+i) + ": " + String.format("%.1f",media));

        }

    }
}
