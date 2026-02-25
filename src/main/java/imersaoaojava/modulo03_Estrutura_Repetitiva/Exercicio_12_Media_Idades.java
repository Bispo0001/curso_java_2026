package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12_Media_Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int idade, soma = 0, cont = 0;
        double media;

        System.out.println("Digite as idades:");
        idade = tc.nextInt();

            while (idade > 0){
                cont++;
                soma += idade;
                idade = tc.nextInt();
            }
        if (cont == 0) {
            System.out.println("Impossível Calcular!");
        }else {
            media = soma / (double)cont;
            System.out.println("Média: " + String.format("%.2f", media));
        }

    }

}
