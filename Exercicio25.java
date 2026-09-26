class Circulo {
    double raio;

    double calcularArea() {
        return Math.PI * raio * raio;
    }

    double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}

public class Exercicio25 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.raio = 5;

        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Circunferência: " + circulo.calcularCircunferencia());
    }
}
