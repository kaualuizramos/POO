class Revista extends MaterialBiblioteca{
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao){
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override 
    String getInformacao(){
        return "Título: " + titulo + "\n Autor: " + autor + "\n Ano de Publicação: " + anoPublicacao + "\n Número da Edição: " + edicao;
    }
}