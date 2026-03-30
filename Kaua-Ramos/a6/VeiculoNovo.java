public class VeiculoNovo extends Veiculo{
    private int garantiaAnos;

    public VeiculoNovo(String marca, String modelo, int ano, double preco, String chassi, int garantiaAnos){
        super(marca, modelo, ano, preco, chassi);
        this.garantiaAnos = garantiaAnos;
    }

    @Override
    public String getDescricao(){
        return "Marca: " + marca + "\nModelo:" + modelo + "\nAno: " + ano + "\nPreço: " + preco + "\nChassi: " + chassi + "\nGarantia Anos: " + garantiaAnos;
    }

}