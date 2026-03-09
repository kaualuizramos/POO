package Lab4;

public class MaterialBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public MaterialBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    String getTitulo() {
        return titulo;
    }
    String getAutor() {
        return autor;
    }
    int getAnoPublicacao() {
        return anoPublicacao;
    }
    String getInformacoes() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao;
    }
}
