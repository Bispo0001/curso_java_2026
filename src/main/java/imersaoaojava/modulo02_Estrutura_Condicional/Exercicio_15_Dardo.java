package imersaoaojava.modulo02_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

/*
No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
foi a maior.
 */
public class Exercicio_15_Dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double distancia1, distancia2, distancia3;

        System.out.print("Digite a primeira distância: ");
        distancia1 = tc.nextDouble();
        System.out.print("Digite a segunda distância: ");
        distancia2 = tc.nextDouble();
        System.out.print("Digite a terceira distância: ");
        distancia3 = tc.nextDouble();

        if (distancia1 > distancia2 && distancia1 > distancia3){
            System.out.println("Maior distância: " + String.format("%.2f", distancia1));
        } else if (distancia2 > distancia3) {
            System.out.println("Maior distância: " + String.format("%.2f", distancia2));
        }else {
            System.out.println("Maior distância: " + String.format("%.2f", distancia3));
        }
    }
}
