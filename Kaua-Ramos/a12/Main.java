public class Main {

    public static void main(String[] args) {

        // Painel principal
        Painel painelPrincipal = new Painel();

        painelPrincipal.adicionar(new Botao("Salvar"));
        painelPrincipal.adicionar(new Texto("Bem-vindo!"));

        // Painel interno
        Painel painelInterno = new Painel();

        painelInterno.adicionar(new Botao("Cancelar"));
        painelInterno.adicionar(new Texto("Mensagem interna"));

        // Adiciona painel interno ao painel principal
        painelPrincipal.adicionar(painelInterno);

        // Renderiza toda a estrutura
        painelPrincipal.renderizar("");
    }
}