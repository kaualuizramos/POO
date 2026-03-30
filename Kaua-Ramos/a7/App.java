import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        System.out.println("--- Caixa Rápido ---");
        carrinho.adicionar(new Item("Café", 8.50));
        carrinho.adicionar(new Item("Pão de queijo", 6.00));
        carrinho.adicionar(new Item("Suco", 9.90));

        System.out.print("\nMeio de pagamento [1-Pix, 2-Cartão, 3-Boleto]: ");
        int opcao = scanner.nextInt();
        
        ProcessadorPagamento processador;

        if (opcao == 1) {
            processador = new PagamentoPix("aluno@exemplo.com");
        } else if (opcao == 2) {
            processador = new PagamentoCartaoCredito("4444-5555", "MARIA SILVA", "123");
        } else {
            processador = new PagamentoBoleto();
        }

        carrinho.finalizarCompra(processador);
        scanner.close();
    }
}