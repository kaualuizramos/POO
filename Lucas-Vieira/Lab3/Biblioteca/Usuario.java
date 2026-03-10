package Biblioteca;
import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nome;
    private int id;
    private List<Livro> livros_emprestados = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public List<Livro> getLivros_emprestados() {
        return livros_emprestados;
    }

    public void emprestarLivro(Livro livro) {
        livro.emprestar();
        livros_emprestados.add(livro);
    }


    public void devolverLivro(Livro livro) {
        livro.devolver();
        livros_emprestados.remove(livro);
    }   

    public void mostrarLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        for (Livro livro : livros_emprestados) {
            System.out.println("- " + livro.getTitulo());
        }
    }
}