public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Java", "João Silva", 2020, 320);
        Revista revista1 = new Revista("C++", "Carlos Lima", 2023, 15);
        EBook ebook1 = new EBook("Programação em Python", "Ana Souza", 2022, "PDF");
        Audiolivro audio1 = new Audiolivro("POO", "Pedro Santos", 2021, 90);

        biblioteca.adicionarMaterial(livro1);
        biblioteca.adicionarMaterial(revista1);
        biblioteca.adicionarMaterial(ebook1);
        biblioteca.adicionarMaterial(audio1);

        System.out.println("LISTA DE MATERIAIS:");
        biblioteca.listarTodosMateriais();

        System.out.println("\nBUSCAR MATERIAL:");
        biblioteca.exibirInformacoesMaterial("Java Básico");

        System.out.println("\nREMOVER MATERIAL:");
        biblioteca.removerMaterial("Tech Hoje");

        System.out.println("\nLISTA ATUALIZADA:");
        biblioteca.listarTodosMateriais();
    }
}