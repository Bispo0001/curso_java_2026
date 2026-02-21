package imersaoaojava.modulo02_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
 */
public class Exercicio_10_Baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double a, b, c, x1, x2, delta;

        System.out.print("Digite o coeficiente de 'a': ");
        a = tc.nextDouble();
        System.out.print("Digite o coeficiente de 'b': ");
        b = tc.nextDouble();
        System.out.print("Digite o coeficiente de 'c': ");
        c = tc.nextDouble();

        delta = Math.pow(b, 2.0) - (4 * a * c);

        if (delta > 0){
            x1 = (-b + Math.sqrt(delta))/ (2.0 * a);
            System.out.println("X1: " + String.format("%.4f",x1));
            x2 = (-b - Math.sqrt(delta))/ (2.0 * a);
            System.out.println("X2: " + String.format("%.4f",x2));
        } else if (delta == 0) {
            x1 = (-b + Math.sqrt(delta))/ (2.0 * a);
            System.out.println("X1: " + String.format("%.4f",x1));
            x2 = (-b - Math.sqrt(delta))/ (2.0 * a);
            System.out.println("X2: " + String.format("%.4f",x2));

        } else {
            System.out.println("Esta equação não possui raizes reais");
        }
    }
}
