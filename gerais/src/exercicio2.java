/*Faça um programa que receba sete números e imprimir o menor
número (suponha números diferentes) entre eles
Obs: use vetores para a resolução do exercício*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        numeros();
    }
    public static void numeros() {
        Scanner leitorNumeros = new Scanner(System.in);

        int numeros[] = new int[7];
        int menorNumero = 0;

        for(int i = 0; i < 7; i++){
            System.out.print("Digite o "+ (i + 1)+"° número: ");
            numeros[i] = leitorNumeros.nextInt();

            for(int j = 1; j < 7; j++){
                menorNumero = numeros[0];

                if (menorNumero > numeros[i]) {
                    menorNumero = numeros[i];
                }
            }
        }

        System.out.println("O menor número é "+menorNumero);
    }
}
