package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
programa.
fórmula de Celsius para Fahrenheit): C = 5/9 * (F - 32)
 */

import java.util.Locale;
import java.util.Scanner;

public class problema_exemplo_do_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        char escala;
        double temperatura, equivalente;


        char resposta;
        do {
            System.out.print("Digite em qual escala você deseja a temperatura (C/F): ");
            escala = tc.next().charAt(0);

            if (escala == 'c' || escala == 'C') {
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = tc.nextDouble();
                equivalente = ((9.0 / 5.0) * temperatura + 32);
                System.out.println("A temperatura equivalente em Fahrenheit: " + String.format("%.2f", equivalente));
                System.out.print("Deseja repetir (s/n)?:  ");
                resposta = tc.next().charAt(0);
            } else {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = tc.nextDouble();
                equivalente = ((temperatura - 32) / 1.8);
                System.out.println("A temperatura equivalente em Celsius: " + String.format("%.2f", equivalente));
                System.out.print("Deseja repetir (s/n)?:  ");
                resposta = tc.next().charAt(0);


            }


        }while (resposta == 's') ;

    }

}
