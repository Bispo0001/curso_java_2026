package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala comduas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
deduzir a fórmula de Celsius para Fahrenheit): C = 5/9 * (F - 32)
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_16_Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        char escala;
        double temperatura, equivalente;

        System.out.print("Digite em qual escala você deseja a temperatura (C/F): ");
        escala = tc.next().charAt(0);

        if (escala == 'C'){
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = tc.nextDouble();
            equivalente = ((9.0/5.0) * temperatura + 32);
            System.out.println("A temperatura equivalente em Fahrenheit: " + String.format("%.2f", equivalente));
        } else {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = tc.nextDouble();
            equivalente = ((temperatura - 32) / 1.8);
            System.out.println("A temperatura equivalente em Celsius: " + String.format("%.2f", equivalente));
        }
    }
}
