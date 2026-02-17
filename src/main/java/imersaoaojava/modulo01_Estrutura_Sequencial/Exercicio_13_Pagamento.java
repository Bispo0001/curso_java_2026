package imersaoaojava.modulo01_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
uma mensagem explicativa.
 */
public class Exercicio_13_Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        String nome;
        double valorHora, salario;
        int qtdHorasTrab;

        System.out.print("Digite o nome: ");
        nome = tc.nextLine();
        System.out.print("Digite o valor pago por hora: ");
        valorHora = tc.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        qtdHorasTrab = tc.nextInt();
        salario = qtdHorasTrab * valorHora;
        System.out.println("**********************************************");
        System.out.printf("O pagamento para %s deve ser R$:%.2f%n", nome, salario);
        System.out.println("**********************************************");

    }
}
