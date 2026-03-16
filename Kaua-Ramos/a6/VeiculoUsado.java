public class VeiculoUsado extends Veiculo{
    private int quilometragem;
    private boolean unicoDono;

    public VeiculoUsado(String marca, String modelo, int ano, double preco, String chassi, int quilometragem, boolean unicoDono){
        super(marca, modelo, ano, preco, chassi);
        this.quilometragem = quilometragem;
        this.unicoDono = unicoDono;
    }

    @Override
    public String getDescricao(){
        return "Marca: " + marca + "\nModelo:" + modelo + "\nAno: " + ano + "\nPreço: " + preco + "\nChassi: " + chassi + "\nQuilometragem: " + quilometragem + "\nÚnico Dono: " + unicoDono;

    }
}