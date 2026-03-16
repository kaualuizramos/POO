package Lab5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Registrar Venda");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Exibir Vendas");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo de veículo (novo/usado): ");
                    String tipo = scanner.nextLine();
                    System.out.println("Digite a marca: ");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.println("Digite o ano: ");
                    String ano = scanner.nextLine();
                    System.out.println("Digite o preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    if (tipo.equalsIgnoreCase("novo")) {
                        System.out.println("Digite a garantia: ");
                        String garantia = scanner.nextLine();
                        VeiculoNovo veiculoNovo = new VeiculoNovo(marca, modelo, ano, preco, garantia);
                        concessionaria.cadastrarVeiculo(veiculoNovo);
                        System.out.println("Veículo novo cadastrado com sucesso!");
                    } else if (tipo.equalsIgnoreCase("usado")) {
                        System.out.println("Digite a quilometragem: ");
                        double quilometragem = scanner.nextDouble();
                        scanner.nextLine(); // Limpar o buffer
                        System.out.println("Digite se é único dono (sim/não): ");
                        String unicoDono = scanner.nextLine();
                        VeiculoUsado veiculoUsado = new VeiculoUsado(marca, modelo, ano, preco, quilometragem, unicoDono);
                        concessionaria.cadastrarVeiculo(veiculoUsado);
                        System.out.println("Veículo usado cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo de veículo inválido. Tente novamente.");
                    }
                    break;
                case 2:
                    System.out.println("Digite a marca do veículo vendido: ");
                    String marcaVenda = scanner.nextLine();
                    System.out.println("Digite o modelo do veículo vendido: ");
                    String modeloVenda = scanner.nextLine();
                    System.out.println("Digite o ano do veículo vendido: ");
                    String anoVenda = scanner.nextLine();
                    concessionaria.registrarVenda(marcaVenda, modeloVenda, anoVenda);
                    System.out.println("Venda registrada com sucesso!");
                    break;
                case 3:
                    concessionaria.exibirEstoque();
                    break;
                case 4:
                    concessionaria.exibirVendas();
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
