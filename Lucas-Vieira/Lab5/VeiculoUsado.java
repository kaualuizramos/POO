package Lab5;

public class VeiculoUsado extends Veiculo {
    private double quilometragem;
    private String unicoDono;
    public VeiculoUsado(String marca, String modelo, String ano, double preco, double quilometragem, String unicoDono) {
        super(marca, modelo, ano, preco);
        this.quilometragem = quilometragem;
        this.unicoDono = unicoDono;
    }
    @Override
    public void getDescricao() {
        System.out.println(this.toString() + "\nQuilometragem: " + quilometragem + "\nÚnico Dono: " + unicoDono);
    }

}