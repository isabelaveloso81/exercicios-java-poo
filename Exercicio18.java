import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        char inicialNome = nome.charAt(0);
        char inicialSobrenome = sobrenome.charAt(0);

        System.out.println("Iniciais: " + inicialNome + inicialSobrenome);

        scanner.close();
    }
}
