package Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private Boolean status;
    private int isbn;

    public Livro(String titulo, String autor, Boolean status, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }   

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void emprestar() {
        if (status) {
            status = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolver() {
        status = true;
        System.out.println("Livro devolvido com sucesso.");
    }

}