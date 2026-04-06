import java.util.UUID;

public class PagamentoBoleto implements ProcessadorPagamento {

    @Override
    public boolean pagar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para pagamento.");
            return false;
        }
        else {
           System.out.println("Código do boleto: " + UUID.randomUUID().toString());
           System.out.println("Insira o código no app ou site do seu banco para efetuar o pagamento.");
           return true;
        }
    }
    
}
