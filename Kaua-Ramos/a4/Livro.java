public class Livro{

    String titulo;
    String autor;
    int ISBN;
    Boolean status;

    Livro(){

    }

    Livro(String titulo, String autor, int ISBN, Boolean status){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.status = status;
    }

    void emprestar(){
        if(status == false){
            status = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    void devolver(){
        if(status == true){
            status = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro já está disponível na biblioteca.");
        }
    }
}