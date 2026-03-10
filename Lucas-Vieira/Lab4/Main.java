package Lab4;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Livro1", "Lucas", 2026, 127);
        Revista revista1 = new Revista("Revista1",  "Maria", 2025, 45);
        Ebook ebook1 = new Ebook("Ebook1", "João", 2024, "PDF");
        Audiolivro audiolivro1 = new Audiolivro("Audiolivro1", "Ana", 2023, 120);
        biblioteca.adicionarMaterial(livro1);
        biblioteca.adicionarMaterial(revista1);
        biblioteca.adicionarMaterial(ebook1);
        biblioteca.adicionarMaterial(audiolivro1);
        biblioteca.listarTodosMateriais();
        System.out.println(livro1.getInformacoes());
        System.out.println(revista1.getInformacoes());
        System.out.println(ebook1.getInformacoes());
        System.out.println(audiolivro1.getInformacoes());
    }
}