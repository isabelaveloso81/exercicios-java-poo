class Conta {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        saldo -= valor;
    }

    void mostrarSaldo() {
        System.out.println(titular + ": R$ " + saldo);
    }
}

public class Exercicio26 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Ana";
        conta1.saldo = 500;
        conta1.depositar(200);

        Conta conta2 = new Conta();
        conta2.titular = "Bruno";
        conta2.saldo = 1000;
        conta2.sacar(300);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
    }
}
