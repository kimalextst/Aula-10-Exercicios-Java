/*Faça um algoritmo que contenha uma função para ler as dimensões de
um retângulo (base e altura), calcular e imprimir para o usuário a área do
retângulo;*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        calculaAreaRetangulo();
    }
    public static void calculaAreaRetangulo() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = leitor.nextInt();
        System.out.print("Digite o valor da altura: ");
        int altura = leitor.nextInt();

        int area = base * altura;

        System.out.println("A area do retângulo é: "+area);

    }
}
