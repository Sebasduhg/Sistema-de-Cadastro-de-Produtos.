public class Produto {
    String nome;
    int quantidade;
    double preco;

    public double getSaldo() {
        return preco * quantidade;
    }

    public void apresentar() {
        System.out.println(nome + " - R$ " + String.format("%.2f", preco) + " - quantidade: " + quantidade + " - total em estoque: R$ " + String.format("%.2f", getSaldo()));
    }
}