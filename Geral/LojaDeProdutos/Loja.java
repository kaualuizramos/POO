package LojaDeProdutos;
import java.util.HashMap;
import java.util.ArrayList;


public class Loja {
    HashMap<String, Produto> produtos = new HashMap<>();
    ArrayList<Produto> vendas = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.put(produto.nomeCategoria(), produto);
        Produto.totalProdutos++;
    }

    public void registrarVenda(String chave) {
        if (produtos.containsKey(chave)) {
            Produto produto = produtos.get(chave);
            vendas.add(produto);
            System.out.println("Venda registrada: " + produto.getDescricao());
        } else {
            System.out.println("Produto não encontrado para venda: " + chave);
        }
    }
    public void exibirEstoque() {
        System.out.println("Estoque da Loja:");
        for (Produto produto : produtos.values()) {
            System.out.println(produto.nomeCategoria());
        }
    }
    public void exibirVendas() {
        System.out.println("Vendas Registradas:");
        for (Produto produto : vendas) {
            System.out.println(produto.getDescricao());
        }
    }
}
