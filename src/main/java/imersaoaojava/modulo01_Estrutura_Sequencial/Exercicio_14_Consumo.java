package imersaoaojava.modulo01_Estrutura_Sequencial;

/*
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14_Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        int distTotal;
        double totalCombustivel, consumoMedio;

        System.out.print("Digite a distância pecorrida: ");
        distTotal = tc.nextInt();
        System.out.print("Digite a quantidade de combustível gasto: ");
        totalCombustivel = tc.nextDouble();
        consumoMedio = distTotal / totalCombustivel;
        System.out.println("*************************************************");
        System.out.printf("O consumo médio é: %.3f%n", consumoMedio);
        System.out.println("*************************************************");

    }
}
