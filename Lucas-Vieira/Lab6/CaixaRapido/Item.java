public class Item {
    String descricao;
    double preco;

    public Item(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
