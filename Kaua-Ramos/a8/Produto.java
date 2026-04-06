public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    public Produto(String nome, double preco, int codigo) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: R$ " + preco;
    }
}