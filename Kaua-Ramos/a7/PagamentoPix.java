public class PagamentoPix implements ProcessadorPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor > 0 && !chavePix.isEmpty()) {
            System.out.println("Processando PIX para chave: " + chavePix + "...");
            return true;
        }
        return false;
    }
}