package pagamentos;

import pagamentos.strategy.FormaPagamentoStrategy;

public class LojaOnline {

    private FormaPagamentoStrategy estrategiaPagamento;

    public LojaOnline(FormaPagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public String finalizarCompra(double valor) {
        return estrategiaPagamento.processarPagamento(valor);
    }
}