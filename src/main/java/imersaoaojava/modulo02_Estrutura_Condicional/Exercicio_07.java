package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.

            Y
            |
      Q2    |    Q1
            |
------------+------------ X
            |
      Q3    |    Q4
            |

 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite a primeira coordenada: ");
        x = tc.nextDouble();
        System.out.print("Digite a segunda coordenada: ");
        y = tc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("As coordenadas estão no quadrante: 'Q1'");
        } else if (x < 0 && y > 0){
            System.out.println("As coordenadas estão no quadrante: 'Q2'");
        } else if (x < 0 && y < 0){
            System.out.println("As coordenadas estão no quadrante: 'Q3'");
        } else if (x > 0 && y < 0){
            System.out.println("As coordenadas estão no quadrante: 'Q4'");
        } else if (x != 0 && y == 0) {
            System.out.println("As coordenadas estão no eixo: 'x'");
        } else if (x == 0 && y != 0) {
            System.out.println("As coordenadas estão no eixo: 'y'");
        } else {
            System.out.println("As coordenadas estão na Origem");
        }
    }
}
