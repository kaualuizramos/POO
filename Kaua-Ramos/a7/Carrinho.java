import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
        System.out.println("- " + item.getDescricao() + ": R$ " + String.format("%.2f", item.getPreco()));
    }

    public double total() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    // Aqui está o Polimorfismo: o Carrinho aceita QUALQUER ProcessadorPagamento
    public void finalizarCompra(ProcessadorPagamento proc) {
        double valorTotal = total();
        System.out.println("\nTotal: R$ " + String.format("%.2f", valorTotal));
        
        if (proc.pagar(valorTotal)) {
            System.out.println("Pagamento aprovado!");
            proc.emitirRecibo(valorTotal);
        } else {
            System.out.println("Pagamento recusado.");
        }
    }
}