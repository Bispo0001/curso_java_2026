package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
horas.
 */

import java.util.Scanner;

public class Exercicio_20_Tempo_de_jogo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int hrinicio, hrfim, duracao;

        System.out.print("Digite a hora inicial: ");
        hrinicio = tc.nextInt();
        System.out.print("Digite a hora final: ");
        hrfim = tc.nextInt();

        if ( hrinicio >= hrfim){
            duracao = (24 - hrinicio) + hrfim;
            System.out.println("O jogo durou: " + duracao + " hora(s)");
        }else {
            duracao = hrfim - hrinicio;
            System.out.println("O jogo durou: " + duracao + " hora(s)");
        }
    }
}
