package imersaoaojava.modulo02_Estrutura_Condicional;

import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int hrinicial, hrfinal, duracao;

        System.out.print("Digite o horário inicial do jogo: ");
        hrinicial = tc.nextInt();
        System.out.print("Digite o horário final do jogo: ");
        hrfinal = tc.nextInt();

        if (hrinicial >= hrfinal ){
           duracao=  24 - hrinicial + hrfinal;
            System.out.println("O jogo durou " + duracao + " hora(s).");
        }else {
            duracao = hrfinal - hrinicial;
            System.out.println("O jogo durou " + duracao + " hora(s).");
        }
    }
}
