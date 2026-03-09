package Lab4;

public class Ebook extends MaterialBiblioteca {
    private String formatoArquivo;

    Ebook(String titulo, String autor, int anoPublicacao, String formatoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    String getInformacoes() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nFormato do Arquivo: " + formatoArquivo;
    }

}