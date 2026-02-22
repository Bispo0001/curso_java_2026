package imersaoaojava.modulo03_Estrutura_Repetitiva;
/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, produto;

        System.out.println("Olá, favor informe o tipo de combustível:");
        System.out.println("1.Álcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim");
        System.out.print("Opção informada: ");
        produto = tc.nextInt();

        while (produto != 4){
            if (produto == 1){
                alcool += 1;
                System.out.println("Olá, favor informe o tipo de combustível:");
                System.out.println("1.Álcool");
                System.out.println("2.Gasolina");
                System.out.println("3.Diesel");
                System.out.println("4.Fim");
                System.out.print("Opção informada: ");
                produto = tc.nextInt();
            } else if (produto == 2){
                gasolina += 1;
                System.out.println("Olá, favor informe o tipo de combustível:");
                System.out.println("1.Álcool");
                System.out.println("2.Gasolina");
                System.out.println("3.Diesel");
                System.out.println("4.Fim");
                System.out.print("Opção informada: ");
                produto = tc.nextInt();
            } else if (produto == 3){
                diesel += 1;
                System.out.println("Olá, favor informe o tipo de combustível:");
                System.out.println("1.Álcool");
                System.out.println("2.Gasolina");
                System.out.println("3.Diesel");
                System.out.println("4.Fim");
                System.out.print("Opção informada: ");
                produto = tc.nextInt();

            }else {
                System.out.println("Olá, favor informe o tipo de combustível:");
                System.out.println("1.Álcool");
                System.out.println("2.Gasolina");
                System.out.println("3.Diesel");
                System.out.println("4.Fim");
                System.out.print("Opção informada: ");
                produto = tc.nextInt();
            }
        }
        System.out.println("**************************************");
        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("**************************************");
    }
}
