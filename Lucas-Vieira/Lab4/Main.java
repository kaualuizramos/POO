package Lab4;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("A", "Lucas", 2026, 127);
        biblioteca.adicionarMaterial(livro1);
        biblioteca.listarTodosMateriais();
        System.out.println(livro1.getInformacoes());
    }
}