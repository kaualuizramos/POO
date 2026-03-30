import java.util.UUID;

public class PagamentoBoleto implements ProcessadorPagamento {
    @Override
    public boolean pagar(double valor) {
        if (valor > 0) {
            String linhaDigitavel = UUID.randomUUID().toString().toUpperCase();
            System.out.println("Boleto gerado! Linha: " + linhaDigitavel);
            return true;
        }
        return false;
    }
}