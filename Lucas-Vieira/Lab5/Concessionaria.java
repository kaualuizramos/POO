package Lab5;
import java.util.HashMap;
import java.util.ArrayList;

public class Concessionaria {
    private HashMap<String, Veiculo> estoque;
    private ArrayList<Veiculo> vendas;

    public Concessionaria() {
        estoque = new HashMap<>();
        vendas = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        estoque.put(veiculo.marca.toLowerCase() + "-" + veiculo.modelo.toLowerCase() + "-" + veiculo.ano.toLowerCase(), veiculo);
    }

    public void registrarVenda(String marca, String modelo, String ano) {
        String key = marca.toLowerCase() + "-" + modelo.toLowerCase() + "-" + ano.toLowerCase();
        if (estoque.containsKey(key)) {
            Veiculo veiculoVendido = estoque.get(key);
            vendas.add(veiculoVendido);
            estoque.remove(key);
            System.out.println("Venda registrada: " + veiculoVendido.marca + " " + veiculoVendido.modelo + " " + veiculoVendido.ano);
        } else {
            System.out.println("Veículo não encontrado no estoque.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque de Veículos:");
        for (Veiculo veiculo : estoque.values()) {
            veiculo.getDescricao();
            System.out.println("--------------------");
        }
    }
    
    public void exibirVendas() {
        System.out.println("Vendas Registradas:");
        for (Veiculo veiculo : vendas) {
            veiculo.getDescricao();
            System.out.println("--------------------");
        }
    }
}
