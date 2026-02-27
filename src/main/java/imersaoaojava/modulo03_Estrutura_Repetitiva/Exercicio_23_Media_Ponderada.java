package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
pela soma dos pesos.
 */


import java.util.Locale;
import java.util.Scanner;

public class Exercicio_23_Media_Ponderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int qtdVezes;
        double nota1, nota2, nota3, media;

        System.out.print("Digite quantos casos você deseja: ");
        qtdVezes = tc.nextInt();

        for (int i = 0; i < qtdVezes; i++){
            System.out.print("Digite o primeiro valor: ");
            nota1 = tc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            nota2 = tc.nextDouble();
            System.out.print("Digite o terceiro valor: ");
            nota3 = tc.nextDouble();

            media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2+3+5));
            System.out.println("************************");
            System.out.printf("Média = %.1f%n", media );
            System.out.println("************************");

        }

    }
}
