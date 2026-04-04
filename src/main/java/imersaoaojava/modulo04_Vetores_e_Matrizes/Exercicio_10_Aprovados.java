package imersaoaojava.modulo04_Vetores_e_Matrizes;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */
public class Exercicio_10_Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = Integer.parseInt(tc.nextLine());
        if (qtdAlunos <= 0) {
            System.out.println("Digite um valor inteiro e positivo!");
            return;
        }

        String[] vetNomeAluno = new String[qtdAlunos];
        double[] vetNota1bimestre = new double[qtdAlunos];
        double[] vetNota2bimestre = new double[qtdAlunos];

        for (int i = 0; i < vetNomeAluno.length; i++) {
            System.out.println("Digite os dados do " + (i + 1) + "º aluno:");
            System.out.print("Nome: ");
            vetNomeAluno[i] = tc.nextLine();
            System.out.print("Nota do 1º Bimestre: ");
            vetNota1bimestre[i] = Double.parseDouble(tc.nextLine());
            System.out.print("Nota do 2º Bimestre: ");
            vetNota2bimestre[i] = Double.parseDouble(tc.nextLine());
        }
        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < vetNomeAluno.length; i++) {
            if (((vetNota1bimestre[i] + vetNota2bimestre[i])/2.0) >= 6.0) {
                System.out.println(vetNomeAluno[i]);
            }
        }
    }
}
