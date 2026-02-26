package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O
algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
escrever mensagem alguma).
 */

import java.util.Scanner;

public class Exercicio_14_Quadrante {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int coordenadaX, coordenadaY;

        System.out.print("Digite a coordenada X: ");
        coordenadaX = tc.nextInt();
        System.out.print("Digite a coordenada Y: ");
        coordenadaY = tc.nextInt();

        while (coordenadaX != 0 && coordenadaY != 0){

            if (coordenadaX > 0 && coordenadaY > 0){
                System.out.println("Quadrante Q1");
                System.out.println("**************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("Quadrante Q2");
                System.out.println("**************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            } else if (coordenadaX < 0 && coordenadaY < 0) {
                System.out.println("Quadrante Q3");
                System.out.println("**************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            }else if (coordenadaX > 0 && coordenadaY < 0){
                System.out.println("Quadrante Q4");
                System.out.println("**************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            }

        }

    }
}
