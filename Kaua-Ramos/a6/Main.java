public class Main {

    public static void main(String[] args) {

        Concessionaria c = new Concessionaria();

        Veiculo novo = new VeiculoNovo(
                "Nissan",
                "Skyline R34",
                1998,
                2000000,
                "CHS001",
                3
        );

        Veiculo usado = new VeiculoUsado(
                "Toyota",
                "Supra",
                1994,
                1500000,
                "CHS002",
                80000,
                true
        );

        c.cadastrarVeiculo(novo);
        c.cadastrarVeiculo(usado);

        System.out.println("=== Estoque Inicial ===");
        c.exibirEstoque();

        c.registrarVenda("CHS001");

        System.out.println("\n=== Estoque Após Venda ===");
        c.exibirEstoque();

        System.out.println("\n=== Veículos Vendidos ===");
        c.exibirVendas();
    }
}