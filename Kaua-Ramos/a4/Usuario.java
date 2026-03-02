import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String Nome;
    int ID;
    List<Livro> livros_emprestados = new ArrayList<>();

    Usuario() {

    }

    Usuario(String Nome, int ID, List<Livro> livros_emprestados){
        this.Nome = Nome;
        this.ID = ID;
        this.livros_emprestados = livros_emprestados;
    }

    void emprestar_livro(Livro livro){

        if(livro.status == false){
            livro.emprestar();
            livros_emprestados.add(livro);
        }
        else{
            System.out.println("Livro indisponível. Impossível emprestar");
        }
}
    void devolver_livro(Livro livro){
        if(livros_emprestados.contains(livro)){
            livro.devolver();
            livros_emprestados.remove(livro);
        }
        else{
            System.out.println("Livro não encontrado na lista de empréstimos do usuário.");
        }
    }
}