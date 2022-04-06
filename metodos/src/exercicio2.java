/*Faça um algoritmo que contenha uma função que receba o nome de um
usuário e retorne a mensagem Meu nome é <NomeDigitado>.*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        nomeUsuario();
    }
    public static void nomeUsuario() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeDigitado = leitor.nextLine();

        System.out.println("Meu nome é "+nomeDigitado);
    }
}
