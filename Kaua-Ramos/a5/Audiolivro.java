class Audiolivro extends MaterialBiblioteca{
    private int duracaoMinutos;

    public Audiolivro(String titulo, String autor, int anoPublicacao, int duracaoMinutos){
        super(titulo, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override 
    String getInformacao(){
        return "Título: " + titulo + "\n Autor: " + autor + "\n Ano de Publicação: " + anoPublicacao + "\n Duração Minutos: " + duracaoMinutos;
    }
}