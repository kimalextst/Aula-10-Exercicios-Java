/*Faça um programa que receba o preço de custo de um produto e
mostre o valor de venda. Sabe-se que o preço de custo receberá um
acréscimo de acordo com um percentual informado pelo usuário.*/

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        conversao();
    }
    public static void conversao() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o preço de custo: ");
        double custo = leitor.nextDouble();
        System.out.print("Insira o percentual para acrescimo: ");
        double percentual = leitor.nextDouble();

        double valor = ((percentual / 100) * custo) + custo;

        System.out.printf("O valor de venda é R$%.2f",valor);
    }
}
