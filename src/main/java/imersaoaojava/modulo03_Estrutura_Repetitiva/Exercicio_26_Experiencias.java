package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto.
 */

import java.util.Scanner;

public class Exercicio_26_Experiencias {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int valor, qtdCobaias, qtdTotal = 0, qtdCoelhos = 0, qtdRatos = 0, qtdSapos = 0;
        double percCoelhos, percRatos, percSapos;
        char tipo;

        System.out.print("Digite quantos caos de testes serão analisados: ");
        valor = tc.nextInt();
        for (int i = 0; i < valor; i++){
            System.out.print("Quantidade de cobaias: ");
            qtdCobaias = tc.nextInt();
            System.out.print("Tipo de Cobaia: ");
            tipo = tc.next().charAt(0);
            qtdTotal =  qtdTotal + qtdCobaias;

            if (tipo == 'C'){
                qtdCoelhos = qtdCoelhos + qtdCobaias;
            } else if (tipo == 'R') {
                qtdRatos = qtdRatos + qtdCobaias;
            } else if (tipo == 'S') {
                qtdSapos = qtdSapos + qtdCobaias;
            } else {
                System.out.println("Opção de Tipo de cobaia inválida!");
            }

        }
        percCoelhos = (double) qtdCoelhos / (double)qtdTotal * 100;
        percRatos = (double)qtdRatos / (double) qtdTotal * 100;
        percSapos = (double)qtdSapos / (double) qtdTotal * 100;

        System.out.println("******************************");
        System.out.println("Relatorio Final:");
        System.out.println("******************************");
        System.out.println("Total: " + qtdTotal + " cobaias");
        System.out.println("Total de coelhos: " + qtdCoelhos);
        System.out.println("Total de ratos: " + qtdRatos);
        System.out.println("Total de sapos: " + qtdSapos);
        System.out.printf("Percentual de coelhos: %.2f", percCoelhos);
        System.out.printf("%nPercentual de ratos: %.2f", percRatos);
        System.out.printf("%nPercentual de sapos: %.2f%n", percSapos);
        System.out.println("******************************");


    }
}
