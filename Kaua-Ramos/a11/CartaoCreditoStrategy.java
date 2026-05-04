package pagamentos.strategy;

public class CartaoCreditoStrategy implements FormaPagamentoStrategy {

    @Override
    public String processarPagamento(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;
        return "Pagamento com Cartão de Crédito aprovado. Taxa: R$" 
                + String.format("%.2f", taxa) 
                + ". Total: R$" 
                + String.format("%.2f", total);
    }
}