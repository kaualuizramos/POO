public class PagamentoCartaoCredito implements ProcessadorPagamento {
    String numero, cvv, nomeTitular;
    private double limiteSimulado = 5000.00;

    public PagamentoCartaoCredito(String numero, String cvv, String nomeTitular) {
        this.numero = numero;
        this.cvv = cvv;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor > limiteSimulado || valor <= 0 || numero == null || cvv == null || nomeTitular == null) {
            System.out.println("Pagamento no cartão recusado");
            return false;
        }
        else {
            System.out.println("Processando pagamento via Cartão de Crédito");
            emitirRecibo(valor);
            return true;
        }
        }
    }
