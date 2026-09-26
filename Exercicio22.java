class Aluno {
    String nome;
    double primeiraNota;
    double segundaNota;

    double calcularMedia() {
        return (primeiraNota + segundaNota) / 2;
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Média: " + calcularMedia());
    }
}

public class Exercicio22 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Marina";
        aluno.primeiraNota = 8.0;
        aluno.segundaNota = 7.0;

        aluno.mostrarDados();
    }
}
