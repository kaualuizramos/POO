package LojaDeProdutos;

public class ProdutoFisico extends Produto{

    private float pesoKg;

    public ProdutoFisico(String nome, String categoria, float preco, int codigo, float pesoKg) {
        super(nome, categoria, preco, codigo);
        this.pesoKg = pesoKg;
    }

    @Override
    public String getDescricao() {
        return "Produto Físico: " + nome + " | Categoria: " + categoria + " | Preço: R$" + preco + " | Código: " + codigo + " | Peso: " + pesoKg + "kg";
    }

    
}
