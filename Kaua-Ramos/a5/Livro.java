class Livro extends MaterialBiblioteca{
    private int numeroPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas){
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    @Override 
    String getInformacao(){
        return "Título: " + titulo + "\n Autor: " + autor + "\n Ano de Publicação: " + anoPublicacao + "\n Número de páginas: " + numeroPaginas;
    }
}