public class MaterialBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    public MaterialBiblioteca(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    String getTitulo(){
        return titulo;
    }
    String getAutor(){
        return autor;
    }
    int getanoPublicacao(){
        return anoPublicacao;
    }
    String getInformacao(){
        return "Título: " + titulo + "\n Autor: " + autor + "\n Ano de Publicação: " + anoPublicacao;
    }
}
