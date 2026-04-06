public class PagamentoPix implements ProcessadorPagamento{
    String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor <= 0 || chavePix == null) {
            System.out.println("Valor inválido para pagamento.");
            return false;
        }
        else {
            System.out.println("Processando pagamento via Pix");
            emitirRecibo(valor);
        }
        return true;
    }
}
