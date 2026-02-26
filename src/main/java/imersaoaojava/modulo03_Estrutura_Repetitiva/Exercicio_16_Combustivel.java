package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
como as quantidades de cada combustível.
 */

import java.util.Scanner;

public class Exercicio_16_Combustivel {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        int opcao;

        System.out.println("Informe o código desejado: ");
        System.out.println("1- Álcool");
        System.out.println("2- Gasolina");
        System.out.println("3- Diesel");
        System.out.println("4- Fim");
        System.out.print("Opção selecionada: ");
        opcao = tc.nextInt();

        while (opcao != 4){
            if (opcao == 1){
                int cont = 0;
                cont ++;
                alcool += cont;
                System.out.println("******************************");
                System.out.println("Informe o código desejado: ");
                System.out.println("1- Álcool");
                System.out.println("2- Gasolina");
                System.out.println("3- Diesel");
                System.out.println("4- Fim");
                System.out.print("Opção selecionada: ");
                opcao = tc.nextInt();
            } else if (opcao == 2) {
                int cont = 0;
                cont ++;
                gasolina += cont;
                System.out.println("******************************");
                System.out.println("Informe o código desejado: ");
                System.out.println("1- Álcool");
                System.out.println("2- Gasolina");
                System.out.println("3- Diesel");
                System.out.println("4- Fim");
                System.out.print("Opção selecionada: ");
                opcao = tc.nextInt();

            } else if (opcao == 3) {
                int cont = 0;
                cont ++;
                diesel += cont;
                System.out.println("******************************");
                System.out.println("Informe o código desejado: ");
                System.out.println("1- Álcool");
                System.out.println("2- Gasolina");
                System.out.println("3- Diesel");
                System.out.println("4- Fim");
                System.out.print("Opção selecionada: ");
                opcao = tc.nextInt();

            }else {
                System.out.println("******************************");
                System.out.println("Valor inválido!");
                System.out.println("Informe o código desejado: ");
                System.out.println("1- Álcool");
                System.out.println("2- Gasolina");
                System.out.println("3- Diesel");
                System.out.println("4- Fim");
                System.out.print("Opção selecionada: ");
                opcao = tc.nextInt();
            }
        }
        System.out.println("******************************");
        System.out.println("Muito Obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("******************************");
    }
}
