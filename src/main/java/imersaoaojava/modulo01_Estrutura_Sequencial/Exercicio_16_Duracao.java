package imersaoaojava.modulo01_Estrutura_Sequencial;

import java.util.Scanner;

/*
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
formato horas:minutos:segundos.
 */
public class Exercicio_16_Duracao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int duracao, horas, minutos, segundos;

        System.out.print("Digite a duração em segundos: ");
        duracao = tc.nextInt();
        horas = (int) duracao / 3600;
        minutos = (int) duracao % 3600 / 60;
        segundos = duracao % 60;
        System.out.println("**********************");
        System.out.println(horas + ":" + minutos + ":" + segundos);
        System.out.println("**********************");


    }
}
