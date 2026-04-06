import java.util.Scanner;

public class CaixaRapido {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new Item("Café", 7.00));
        carrinho.adicionarItem(new Item("Pão de Queijo", 3.50));
        carrinho.adicionarItem(new Item("Suco", 5.00));
        carrinho.exibirItens();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a forma de pagamento: 1 - PIX, 2 - Cartão de Crédito, 3 - Boleto");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Insira a chave PIX:");
                String chavePix = scanner.next();
                ProcessadorPagamento pix = new PagamentoPix(chavePix);
                carrinho.finalizarCompra(pix);
                break;
            case 2:
                System.out.println("Insira o número do cartão:");
                String numero = scanner.next();
                System.out.println("Insira o CVV:");
                String cvv = scanner.next();
                System.out.println("Insira o nome do titular:");
                String nomeTitular = scanner.next();
                ProcessadorPagamento cartaoCredito = new PagamentoCartaoCredito(numero, cvv, nomeTitular);
                carrinho.finalizarCompra(cartaoCredito);
                break;
            case 3:
                ProcessadorPagamento boleto = new PagamentoBoleto();
                carrinho.finalizarCompra(boleto);
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
        }
        scanner.close();


    }
    
}
