import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Java_Lab03_1{

    public static void main(String[] args){

    //livros

    Livro livro1 = new Livro("Java", "James Gosling", 123, false);
    Livro livro2 = new Livro("POO", "Ana Silva", 456, false);

    //usuário

    Usuario usuario1 = new Usuario("Azoia", 1, new ArrayList<>());

    //emprestar

    usuario1.emprestar_livro(livro1);
    usuario1.emprestar_livro(livro2);

    //devolver

    usuario1.devolver_livro(livro1);
    usuario1.devolver_livro(livro2);
    
    }
}