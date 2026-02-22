package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int coordenadaX, coordenadaY;

        System.out.print("Digite a coordenada X: ");
        coordenadaX = tc.nextInt();
        System.out.print("Digite a coordenada Y: ");
        coordenadaY = tc.nextInt();

        while (coordenadaX != 0 || coordenadaY !=0){

            if (coordenadaX > 0 && coordenadaY > 0){
                System.out.println("Primeiro Quadrante");
                System.out.println("*********************************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            } else if (coordenadaX < 0 && coordenadaY > 0){
                System.out.println("Segundo Quadrante");
                System.out.println("*********************************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            } else if (coordenadaX < 0 && coordenadaY < 0){
                System.out.println("Terceiro Quadrante");
                System.out.println("*********************************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            }else if (coordenadaX > 0 && coordenadaY < 0){
                System.out.println("Quarto Quadrante");
                System.out.println("*********************************************");
                System.out.print("Digite a coordenada X: ");
                coordenadaX = tc.nextInt();
                System.out.print("Digite a coordenada Y: ");
                coordenadaY = tc.nextInt();
            }

        }
    }
}
