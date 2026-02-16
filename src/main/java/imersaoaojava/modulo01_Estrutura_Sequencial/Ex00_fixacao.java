package imersaoaojava.modulo01_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex00_fixacao {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String produto1, produto2;
        int idade, codigo;
        char genero;
        double preco1, preco2, medida;

        System.out.print("Digite o nome do primeiro produto: ");
        produto1 = tc.nextLine();
        System.out.print("Digite o preço do primeiro produto: ");
        preco1 = tc.nextDouble();
        tc.nextLine();
        System.out.print("Digite o nome do segundo produto: ");
        produto2 = tc.nextLine();
        System.out.print("Digite o preço do segundo produto: ");
        preco2 = tc.nextDouble();
        System.out.println("***********************************************");
        System.out.print("Digite a idade: ");
        idade = tc.nextInt();
        System.out.print("Digite o código de 5 números: ");
        codigo = tc.nextInt();
        System.out.print("Digite o gênero 'M' ou 'F': ");
        genero = tc.next().charAt(0);
        System.out.print("Digite uma medida com 8 casas decimais: ");
        medida = tc.nextDouble();
        System.out.println();
        System.out.println("Produtos:");
        System.out.printf(produto1 + ", cujo o preço é R$: %.2f",preco1);
        System.out.printf("%n"+ produto2 + ", cujo o preço é R$: %.2f",preco2);
        System.out.println();
        System.out.printf("%nRegistro: " + idade + " anos de idade, código: " + codigo + " e gênero: " + genero);
        System.out.println();
        System.out.printf("%nMedida com oito casas decimais: " + medida);
        System.out.printf("%nArredondado (três casas decimais): %.3f",medida);
        Locale.setDefault(Locale.US);
        System.out.printf("%nPonto decimal americano: %.3f",medida);



    }
}