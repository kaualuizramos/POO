package Lab4;

public class Livro extends MaterialBiblioteca {
    private int numeroPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    String getInformacoes() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nNumero de Paginas: " + numeroPaginas;
    }

}