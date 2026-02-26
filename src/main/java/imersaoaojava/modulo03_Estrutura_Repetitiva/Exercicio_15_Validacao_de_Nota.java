package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
intervalo [0,10]). Cada nota deve ser validada separadamente.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15_Validacao_de_Nota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = tc.nextDouble();
        while (nota1 < 0.0 || nota1 > 10){
            System.out.println("Valor invalido!");
            System.out.print("Digite a primeira nota: ");
            nota1 = tc.nextDouble();
        }
        System.out.print("Digite a segunda nota: ");
        nota2 = tc.nextDouble();
        while (nota2 < 0 || nota2 > 10){
            System.out.println("Valor invalido!");
            System.out.print("Digite a segunda nota: ");
            nota2 = tc.nextDouble();
        }
        media = (nota1 + nota2) / 2;
        System.out.printf("Média = %.2f",media);
    }
}
