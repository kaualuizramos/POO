package pagamentos.strategy;

public class TransferenciaBancariaStrategy implements FormaPagamentoStrategy {

    @Override
    public String processarPagamento(double valor) {
        double desconto = valor * 0.02;
        double total = valor - desconto;
        return "Pagamento por Transferência Bancária aprovado. Desconto: R$" 
                + String.format("%.2f", desconto) 
                + ". Total: R$" 
                + String.format("%.2f", total);
    }
}