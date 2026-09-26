import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));

        if (numero2 != 0) {
            System.out.println("Divisão: " + (numero1 / numero2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
