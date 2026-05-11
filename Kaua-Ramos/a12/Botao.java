public class Botao implements ComponenteGUI {

    private String texto;

    public Botao(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar(String identacao) {
        System.out.println(identacao + "Botão: " + texto);
    }
}