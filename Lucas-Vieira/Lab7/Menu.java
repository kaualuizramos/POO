import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<Integer, Produto> menu;

    public Menu() {
        menu = new HashMap<>();
    }

    public void adicionarProduto(String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("ERRO: O preço do produto não pode ser negativo.");
        }
        if (menu.size() >= 5) {
            System.out.println("Limite de produtos atingido. Não é possível adicionar mais produtos.");
            return;
        }
        menu.put(menu.size() + 1, new Produto(nome, preco));
    }

    public void exibirMenu() {
        System.out.println("Menu:");
        for (Produto produto : menu.values()) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }

    public void calcularMediaPreco() {
        double totalPreco = 0;
        for (Produto produto : menu.values()) {
            totalPreco += produto.getPreco();
        }
        double mediaPreco = totalPreco / menu.size();
        System.out.println("Preço médio dos produtos: R$" + mediaPreco);
    }
    
    public void consultarProduto(int posicao) {
            Produto produto = menu.get(posicao);
            System.out.println("Produto na posição " + posicao + ": " + produto.getNome() + " - R$" + produto.getPreco());
    }
}