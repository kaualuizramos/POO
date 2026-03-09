package Lab4;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<MaterialBiblioteca> materiais = new ArrayList<>();

    public Biblioteca() {
    }

    public void adicionarMaterial(MaterialBiblioteca material) {
        materiais.add(material);
    }
    
    public void removerMaterial(String titulo) {
        for (int i = 0; i < materiais.size(); i++) {
            if (materiais.get(i).getTitulo().equals(titulo)) {
                materiais.remove(i);
                return;
            }
        }
    }
    public void exibirInformacoesMaterial(String titulo) {
        for (int i = 0; i < materiais.size(); i++) {
            if (materiais.get(i).getTitulo().equals(titulo)) {
                System.out.println(materiais.get(i).getInformacoes());
                return;
            }
        }
    }
    public void listarTodosMateriais() {
        System.out.println("Lista de materiais:");
        for (int i=0; i < materiais.size(); i++) {
            System.out.println("\n" + materiais.get(i).getTitulo());
        }
    }

}

