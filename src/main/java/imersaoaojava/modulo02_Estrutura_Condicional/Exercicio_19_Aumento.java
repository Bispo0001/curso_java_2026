package imersaoaojava.modulo02_Estrutura_Condicional;
/*
Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto
cada pessoa ganha, conforme tabela ao lado. Fazer um programa para ler o salário de uma pessoa, daí mostrar
qual o novo salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a porcentagem de aumento.

+----------------------------------------+----------+
| Salário atual                          | Aumento  |
+----------------------------------------+----------+
| Até R$ 1.000,00                        | 20%      |
| Acima de R$ 1.000,00 até R$ 3.000,00   | 15%      |
| Acima de R$ 3.000,00 até R$ 8.000,00   | 10%      |
| Acima de R$ 8.000,00                   | 5%       |
+----------------------------------------+----------+
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_19_Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        double salario,  novoSalario, aumento;
        int porcentagem;


        System.out.print("Digite o salário do funcionário: ");
        salario = tc.nextDouble();

        if (salario <= 1000.00){
            porcentagem = 20;
            aumento = salario * (porcentagem / 100.00);
            novoSalario = salario + aumento;
            System.out.printf("%n Novo salário = R$ %.2f", novoSalario);
            System.out.printf("%n Aumento = R$ %.2f", aumento);
            System.out.println("Porcentagem = " + porcentagem + " %");
        } else if (salario > 1000.00 && salario <= 3000.00){
            porcentagem = 15;
            aumento = salario * (porcentagem / 100.00);
            novoSalario = salario + aumento;
            System.out.printf("%nNovo salário = R$ %.2f", novoSalario);
            System.out.printf("%nAumento = R$ %.2f", aumento);
            System.out.println("\nPorcentagem = " + porcentagem + " %");

        } else if (salario > 3000.00 && salario <= 8000.00){
            porcentagem = 10;
            aumento = salario * (porcentagem / 100.00);
            novoSalario = salario + aumento;
            System.out.printf("%nNovo salário = R$ %.2f", novoSalario);
            System.out.printf("%nAumento = R$ %.2f", aumento);
            System.out.println("\nPorcentagem = " + porcentagem + " %");

        }else {
            porcentagem = 5;
            aumento = salario * (porcentagem / 100.00);
            novoSalario = salario + aumento;
            System.out.printf("%nNovo salário = R$ %.2f", novoSalario);
            System.out.printf("%nAumento = R$ %.2f", aumento);
            System.out.println("\nPorcentagem = " + porcentagem + " %");
        }

    }
}
