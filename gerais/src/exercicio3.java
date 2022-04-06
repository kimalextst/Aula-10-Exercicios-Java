/*Escrever um programa que leia o nome de um vendedor, o seu
salário fixo e o total de vendas efetuadas por ele no mês (em
dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
suas vendas efetuadas, informar o seu nome, o salário fixo e salário
no final do mês*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        pegarInformacoes();
    }
    public static void pegarInformacoes() {
        Scanner leitorNome = new Scanner(System.in);
        Scanner leitorSalario = new Scanner(System.in);

        System.out.print("Insira o nome do vendedor: ");
        String nome = leitorNome.nextLine();
        System.out.print("Insira o valor do salario fixo: ");
        double salarioFixo = leitorSalario.nextDouble();
        System.out.print("Insira a quantidade de vendas feitas no mês: ");
        double vendas = leitorSalario.nextDouble();

        informacoesFuncionario(nome, salarioFixo, vendas);
    }

    public static void informacoesFuncionario(String nome, double salarioFixo, double vendas) {
        double salarioTotal = (vendas * 0.15) + salarioFixo;
        
        System.out.println("Nome: "+nome);
        System.out.println("Salario fixo: "+salarioFixo);
        System.out.println("Salario total: "+salarioTotal);
    }
}

