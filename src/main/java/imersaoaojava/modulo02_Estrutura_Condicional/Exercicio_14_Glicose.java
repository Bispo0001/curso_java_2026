package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Fazer um programa para ler a quantidade de glicose
no sangue de uma pessoa e depois mostrar na tela a
classificação desta glicose de acordo com a tabela de
referência ao lado.

+---------------+------------------------------+
| Classificação | Glicose                      |
+---------------+------------------------------+
| Normal        | Até 100 mg/dl                |
| Elevado       | Maior que 100 até 140 mg/dl  |
| Diabetes      | Maior de 140 mg/dl           |
+---------------+------------------------------+
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14_Glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double glicoseMedida;

        System.out.print("Digite a medida da glicose: ");
        glicoseMedida = tc.nextDouble();

        if (glicoseMedida <= 100){
            System.out.println("Classificação: Normal");
        } else if (glicoseMedida > 100 && glicoseMedida <= 140) {
            System.out.println("Classificação: Elevado");
        }else {
            System.out.println("Classificação: Diabetes");
        }
    }
}
