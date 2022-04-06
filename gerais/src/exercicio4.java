/*Escrever um programa que leia o nome de um aluno e as notas das
três provas que ele obteve no semestre. No final informar o nome do
aluno e a sua média (aritmética)
Obs: use vetores para a resolução do exercício*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        boletimAluno();
    }
    public static void boletimAluno() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.println("");

        double notas[] = new double[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Insira a "+(i + 1)+"° nota: ");
            notas[i] = leitor.nextInt();
        }

        System.out.println("\n--------------------\n");
        System.out.println("Nome do aluno: "+nome+"\n");
        
        for(int i = 0; i < 3; i++){
            System.out.println((i+ 1)+"° nota: "+notas[i]);
        }
    }
}
