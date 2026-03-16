abstract class Veiculo{
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;
    protected static int totalVeiculos;
    protected String chassi;

    //Construtores:

    public Veiculo(String marca, String modelo, int ano, double preco, String chassi){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.chassi = chassi;
        totalVeiculos++;
    }

    //Métodos:

    public String getChassi() {
    return chassi;
}

    public static int getNumVeiculos(){
        return totalVeiculos;
    }

    public abstract String getDescricao();

    @Override
    public String toString(){
        return "--- Informações do Veículo --- \n" + getDescricao();
    }

}