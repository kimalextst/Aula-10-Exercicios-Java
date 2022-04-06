import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leitor.nextLine();

        exibeNomeUsuario(nome,sobrenome);

        leitor.close();
    }
    public static void exibeNomeUsuario(String nome, String sobrenome) {
        System.out.println("Olá "+nome+" "+sobrenome);
    }
}
