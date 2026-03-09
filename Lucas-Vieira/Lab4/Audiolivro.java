package Lab4;

public class Audiolivro extends MaterialBiblioteca {
    private int duracaoMinutos;

    Audiolivro(String titulo, String autor, int anoPublicacao, int duracaoMinutos) {
        super(titulo, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    String getInformacoes() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nDuracao em Minutos: " + duracaoMinutos;
    }

}