class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        saldo -= valor;
    }

    void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}

public class Exercicio23 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Marina";
        conta.numero = 12345;
        conta.saldo = 1000.00;

        conta.depositar(500.00);
        conta.sacar(200.00);

        conta.mostrarSaldo();
    }
}
