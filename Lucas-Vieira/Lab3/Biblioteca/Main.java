package Biblioteca;

public class Main {
    
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true, 123456);
        Usuario usuario1 = new Usuario("Lucas Vieira", 1);

        usuario1.emprestarLivro(livro1);
        System.out.println("Livros emprestados por " + usuario1.getNome() + ": " + usuario1.getLivros_emprestados().size());

        usuario1.devolverLivro(livro1);
        System.out.println("Livros emprestados por " + usuario1.getNome() + ": " + usuario1.getLivros_emprestados().size());

        usuario1.mostrarLivrosEmprestados();
        
        usuario1.emprestarLivro(livro1);
        System.out.println("Livros emprestados por " + usuario1.getNome() + ": " + usuario1.getLivros_emprestados().size());

        usuario1.mostrarLivrosEmprestados();
    }
}
