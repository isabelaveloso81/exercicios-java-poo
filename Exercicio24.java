class Lampada {
    String cor;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada " + cor + ": ligada");
        } else {
            System.out.println("Lâmpada " + cor + ": desligada");
        }
    }
}

public class Exercicio24 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.cor = "Branca";

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.ligar();
        lampada.mostrarEstado();
    }
}
