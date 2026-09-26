import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Quantidade de caracteres: " + nomeCompleto.length());

        scanner.close();
    }
}
