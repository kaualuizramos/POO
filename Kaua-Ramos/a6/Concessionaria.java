import java.util.*;

public class Concessionaria {

    private Map<String, Veiculo> estoque = new HashMap<>();
    private ArrayList<Veiculo> vendidos = new ArrayList<>();

    // Cadastrar veículo no estoque
    public void cadastrarVeiculo(Veiculo veiculo) {
        estoque.put(veiculo.getChassi(), veiculo);
    }

    // Registrar venda usando o chassi
    public void registrarVenda(String chassi) {

        Veiculo v = estoque.remove(chassi);

        if (v != null) {
            vendidos.add(v);
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    // Exibir veículos em estoque
    public void exibirEstoque() {

        for (Veiculo v : estoque.values()) {
            System.out.println(v);
        }
    }

    // Exibir veículos vendidos
    public void exibirVendas() {

        for (Veiculo v : vendidos) {
            System.out.println(v);
        }
    }
}