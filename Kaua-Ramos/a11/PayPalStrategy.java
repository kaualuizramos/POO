package pagamentos.strategy;

public class PayPalStrategy implements FormaPagamentoStrategy {

    @Override
    public String processarPagamento(double valor) {
        double taxa = valor * 0.03;
        double total = valor + taxa;
        return "Pagamento via PayPal aprovado. Taxa: R$" 
                + String.format("%.2f", taxa) 
                + ". Total: R$" 
                + String.format("%.2f", total);
    }
}