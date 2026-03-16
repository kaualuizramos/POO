package LojaDeProdutos;
import java.util.Scanner;

//Feito por Lucas Vieira e Kauã Ramos

public class Menu {

    public static void main(String[] args) {
        Loja loja = new Loja();
        int codigo = 0;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu da Loja de Produtos:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Registrar Venda");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Exibir Vendas");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar nova linha remanescente

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo de produto (1 para Físico, 2 para Digital):");
                    int tipoProduto = scanner.nextInt();
                    scanner.nextLine(); // consome newline após número

                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Digite a categoria do produto:");
                    String categoriaProduto = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    float precoProduto = scanner.nextFloat();
                    scanner.nextLine(); // consome newline após float

                    if (tipoProduto == 1) {
                        System.out.println("Digite o peso do produto em kg:");
                        float pesoProduto = scanner.nextFloat();
                        scanner.nextLine(); // consome newline após float
                        ProdutoFisico produtoFisico = new ProdutoFisico(nomeProduto, categoriaProduto, precoProduto, codigo++, pesoProduto);
                        loja.cadastrarProduto(produtoFisico);
                    } else if (tipoProduto == 2) {
                        System.out.println("Digite o tamanho do arquivo em MB:");
                        float tamanhoArquivo = scanner.nextFloat();
                        scanner.nextLine(); // consome newline após float

                        System.out.println("Digite o formato do arquivo:");
                        String formatoArquivo = scanner.nextLine();
                        ProdutoDigital produtoDigital = new ProdutoDigital(nomeProduto, categoriaProduto, precoProduto, codigo++, tamanhoArquivo, formatoArquivo);
                        loja.cadastrarProduto(produtoDigital);
                    } else {
                        System.out.println("Tipo de produto inválido.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do produto para registrar a venda:");
                    String nomeVenda = scanner.nextLine();
                    boolean encontrado = false;
                    for (Produto produto : loja.produtos.values()) {
                        if (produto.nome.equals(nomeVenda)) {
                            loja.registrarVenda(produto.nomeCategoria());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado para venda: " + nomeVenda);
                    }
                    break;
                case 3:
                    loja.exibirEstoque();
                    break;
                case 4:
                    loja.exibirVendas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
}
