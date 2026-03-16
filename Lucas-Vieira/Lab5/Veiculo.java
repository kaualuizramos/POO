package Lab5;

public abstract class Veiculo {
    protected String marca, modelo, ano;
    protected double preco;

    public static int totalVeiculos = 0;

    public Veiculo(String marca, String modelo, String ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    static public int getTotalVeiculos() {
        return totalVeiculos;
    }

    abstract public void getDescricao();

    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nPreço: R$" + preco;
    }
}
