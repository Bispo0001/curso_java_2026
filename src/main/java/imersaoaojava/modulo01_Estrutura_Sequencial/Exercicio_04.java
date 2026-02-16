package imersaoaojava.modulo01_Estrutura_Sequencial;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int idFuncionario, horaTrabalahada;
        double valorHora, salario;

        System.out.print("Digite o número do funcionário: ");
        idFuncionario = tc.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        horaTrabalahada = tc.nextInt();
        System.out.print("Digite o valor da hora trabalhada do funcionário: ");
        valorHora = tc.nextDouble();
        salario = horaTrabalahada * valorHora;
        System.out.println("ID Funcionário: " + idFuncionario);
        System.out.printf("Salário: R$ %.2f", salario);


    }
}
