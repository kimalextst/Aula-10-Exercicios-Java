/*Ler uma temperatura em graus Celsius e apresentá-la convertida em
graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
a temperatura em Fahrenheit e C a temperatura em Celsius.*/

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        calcularTemperatura();
    }
    public static void calcularTemperatura() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a temperatura em °C: ");
        double celsius = leitor.nextDouble();
        
        double fahrenheit = ((9 * celsius) + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: "+fahrenheit+"°F");
    }
}

