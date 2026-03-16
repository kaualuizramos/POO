package LojaDeProdutos;

public class ProdutoDigital extends Produto{
    private float tamanhoArquivoMB;
    private String formato;

    public ProdutoDigital(String nome, String categoria, float preco, int codigo, float tamanhoArquivoMB, String formato) {
        super(nome, categoria, preco, codigo);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
        this.formato = formato;
    }

    @Override
    public String getDescricao() {
        return "Produto Digital: " + nome + " | Categoria: " + categoria + " | Preço: R$" + preco + " | Código: " + codigo + " | Tamanho do Arquivo: " + tamanhoArquivoMB + "MB | Formato: " + formato;
    }


}
