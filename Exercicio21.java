class Produto {
    String nome;
    double preco;
    int quantidade;

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void mostrarDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + calcularValorEstoque());
    }
}

public class Exercicio21 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Caderno";
        produto1.preco = 20.00;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta";
        produto2.preco = 3.50;
        produto2.quantidade = 20;

        produto1.mostrarDados();

        System.out.println();

        produto2.mostrarDados();
    }
}
