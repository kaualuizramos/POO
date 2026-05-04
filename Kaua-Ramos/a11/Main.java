package pagamentos;

import pagamentos.strategy.CartaoCreditoStrategy;
import pagamentos.strategy.PayPalStrategy;
import pagamentos.strategy.TransferenciaBancariaStrategy;

public class Main {

    public static void main(String[] args) {

        double valorPedido = 100.0;

        System.out.println("=== Cartão de Crédito ===");
        LojaOnline loja1 = new LojaOnline(new CartaoCreditoStrategy());
        System.out.println(loja1.finalizarCompra(valorPedido));

        System.out.println("\n=== PayPal ===");
        LojaOnline loja2 = new LojaOnline(new PayPalStrategy());
        System.out.println(loja2.finalizarCompra(valorPedido));

        System.out.println("\n=== Transferência Bancária ===");
        LojaOnline loja3 = new LojaOnline(new TransferenciaBancariaStrategy());
        System.out.println(loja3.finalizarCompra(valorPedido));
    }
}