/*Elaborar um programa que efetue a apresentação do valor da
conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
deverá solicitar o valor da cotação do dólar e também a quantidade
de dólares disponíveis com o usuário.*/

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        conversao();
    }
    public static void conversao() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a cotação atual do dolar: R$");
        double cotacao = leitor.nextDouble();
        System.out.print("Insira a quantidade de dolares disponiveis: $");
        double dolar = leitor.nextDouble();

        double valor = dolar * cotacao;

        System.out.printf("O valor em real é R$%.2f",valor);
    }
}
