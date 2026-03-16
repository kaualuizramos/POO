package Lab5;

public class VeiculoNovo extends Veiculo {
    private String garantia;
    public VeiculoNovo(String marca, String modelo, String ano, double preco, String garantia) {
        super(marca, modelo, ano, preco);
        this.garantia = garantia;
    }
    @Override
    public void getDescricao() {
        System.out.println(this.toString() + "\nGarantia: " + garantia);
    }

}
