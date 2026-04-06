public class Produto {
    String nome;
    double preco;
    int codigo;

    public Produto(String nome, double preco, int codigo) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: R$ " + preco;
    }
}