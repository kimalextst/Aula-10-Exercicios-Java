/*Faça um algoritmo que contenha uma função que calcule o IMC de um
usuário a partir da inserção do seu peso e de sua altura. Exiba a
classificação do usuário após a verificação do seu IMC.

IMC CLASSIFICAÇÃO OBESIDADE (GRAU)
MENOR QUE 18,5 MAGREZA 0
ENTRE 18,5 E 24,9 NORMAL 0
ENTRE 25,0 E 29,9 SOBREPESO I
ENTRE 30,0 E 39,9 OBESIDADE II
MAIOR QUE 40,0 OBESIDADE GRAVE III*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        calculaIMC();
    }
    public static void calculaIMC() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu peso(kg): ");
        double peso = leitor.nextDouble();
        System.out.print("Digite sua altura(m): ");
        double altura = leitor.nextDouble();

        double IMC = peso / (altura * altura);

        if(IMC < 18.5) {
            System.out.printf("Você esta abaixo do peso - Magreza: %.1f",IMC);
        } else if(IMC >= 18.5 && IMC <= 24.9) { 
            System.out.printf("Você está no peso ideal - Normal: %.1f",IMC);
        } else if(IMC >= 25 && IMC <= 29.9) { 
            System.out.printf("Você está com sobrepeso - Obesidade grau I: %.1f",IMC);
        } else if(IMC >=30 && IMC <= 39.9) { 
            System.out.printf("Você está com obesidade - Obesidade grau II: %.1f",IMC);
        } else{ 
            System.out.printf("Você está com obesidade grave (Obesidade grau III: %.1f",IMC);
        }
    }
}
