package pagamentos.strategy;

public interface FormaPagamentoStrategy {
    String processarPagamento(double valor);
}