class EBook extends MaterialBiblioteca{
    private String formatoArquivo;

    public EBook(String titulo, String autor, int anoPublicacao, String formatoArquivo){
        super(titulo, autor, anoPublicacao);
        this.formatoArquivo = formatoArquivo;
    }

    @Override 
    String getInformacao(){
        return "Título: " + titulo + "\n Autor: " + autor + "\n Ano de Publicação: " + anoPublicacao + "\n Formato do Arquivo: " + formatoArquivo;
    }
}