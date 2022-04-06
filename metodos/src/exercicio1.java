/*Faça um algoritmo que contenha um método que receba um número do
usuário e realize a somatório de todos os números no intervalo de 1 até o
número digitado pelo usuário. Exiba o resultado final da somatória.*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        somatorio();
    }

    public static void somatorio() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        int soma = 0;
        
        for(int i = 0; i <= numero; i++){
            soma = soma + i;
        }

        System.out.println("O resultado é "+soma);
    }
}
