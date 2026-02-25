package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Fazer um programa para ler um valor inteiro de 1 a 7 representando um
dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos.
 */

import java.util.Scanner;

public class Exemplo_Switch_Case {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int diaSemana;

        System.out.print("Digite uma valor inteiro representando o dia da semana (1-7): ");
        diaSemana = tc.nextInt();

        if (diaSemana > 7 || diaSemana == 0){
            System.out.println("Valor inválido, digite um número de 1 a 7.");
        }else {
            switch (diaSemana) {
                case 1:
                    System.out.println("Domingo");
                    break;

                case 2:
                    System.out.println("Segunda-Feira");
                    break;

                case 3:
                    System.out.println("Terça-Feira");
                    break;

                case 4:
                    System.out.println("Quarta-Feira");
                    break;

                case 5:
                    System.out.println("Quinta-Feira");
                    break;

                case 6:
                    System.out.println("Sexta-Feira");
                    break;

                case 7:
                    System.out.println("Sábado");
                    break;
            }
        }
    }
}
