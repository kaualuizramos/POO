import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        if (item != null) {
            itens.add(item);
        }
    }

    public double total() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println("Itens no carrinho:");
        for (Item item : itens) {
            System.out.println("- " + item.getDescricao() + ": R$ " + String.format("%.2f", item.getPreco()));
        }
    }

    void finalizarCompra(ProcessadorPagamento processador) {
        double valorTotal = total();
        if (processador.pagar(valorTotal)) {
            System.out.println("Compra finalizada com sucesso!");
        } else {
            System.out.println("Falha no pagamento. Compra não finalizada.");
        }
    }
    
}
