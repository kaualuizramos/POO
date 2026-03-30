public class PagamentoCartaoCredito implements ProcessadorPagamento {
    private String numero, nomeTitular, cvv;
    private double limiteSimulado = 5000.0;

    public PagamentoCartaoCredito(String numero, String nomeTitular, String cvv) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cvv = cvv;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor <= limiteSimulado && !numero.isEmpty()) {
            System.out.println("Autorizando cartão " + numero + " (Titular: " + nomeTitular + ")...");
            return true;
        }
        System.out.println("Cartão recusado: Valor excede o limite (R$ 5000,00).");
        return false;
    }
}