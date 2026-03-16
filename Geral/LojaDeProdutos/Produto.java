package LojaDeProdutos;

public abstract class Produto {

    protected String nome;
    protected String categoria;
    protected float preco;
    protected int codigo;

    public Produto(String nome, String categoria, float preco, int codigo) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.codigo = codigo;
    }

    public static int totalProdutos = 0;

    public abstract String getDescricao();

    public String toString() {
        return getDescricao();
    }

    public String nomeCategoria() {
        return nome + " - " + categoria;
    }
  
    


}
