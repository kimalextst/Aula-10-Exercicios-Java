/*Escreva um programa que receba dois números e ao final mostre a
soma, subtração, multiplicação e a divisão dos números lidos*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        pegarDados();
    }
    public static void pegarDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroA = leitor.nextInt();
        System.out.print("Digite mais um número: ");
        int numeroB = leitor.nextInt();

        soma(numeroA, numeroB);
        subtracao(numeroA, numeroB);
        multiplicacao(numeroA, numeroB);
        divisao(numeroA, numeroB);
    }

    public static int soma(int n1, int n2) {
        int soma = n1 + n2;
        System.out.println("O resultado da soma entre "+n1+" e "+n2+" é "+soma);
        return soma;
    }

    public static int subtracao(int n1, int n2) {
        int subtracao = n1 - n2;
        System.out.println("O resultado da subtração entre "+n1+" e "+n2+" é "+subtracao);
        return subtracao;
    }

    public static int multiplicacao(int n1, int n2) {
        int multiplicacao = n1 * n2;
        System.out.println("O resultado da multiplicação entre "+n1+" e "+n2+" é "+multiplicacao);
        return multiplicacao;
    }

    public static int divisao(int n1, int n2) {
        int divisao = n1 / n2;
        System.out.println("O resultado da divisão entre "+n1+" e "+n2+" é "+divisao);
        return divisao;
    }
}
