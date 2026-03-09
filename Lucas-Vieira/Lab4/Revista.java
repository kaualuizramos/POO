package Lab4;

public class Revista extends MaterialBiblioteca {
    private int edicao;

    Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    String getInformacoes() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nEdicao: " + edicao;
    }

}