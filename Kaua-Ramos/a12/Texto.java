public class Texto implements ComponenteGUI {

    private String conteudo;

    public Texto(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void renderizar(String identacao) {
        System.out.println(identacao + "Texto: " + conteudo);
    }
}