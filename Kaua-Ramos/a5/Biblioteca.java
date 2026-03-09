import java.util.ArrayList;

class Biblioteca {
    private ArrayList<MaterialBiblioteca> materiais;

    public Biblioteca(){
        materiais = new ArrayList<>();
    }

    void adicionarMaterial(MaterialBiblioteca material){
        materiais.add(material);
    }

    void removerMaterial(String titulo){
        for(int i = 0; i < materiais.size(); i++){
            if(materiais.get(i).getTitulo().equalsIgnoreCase(titulo)){
                materiais.remove(i);
                System.out.println("Material removido.");
                return;
            }
        }
        System.out.println("Material não encontrado.");
    }

    void exibirInformacoesMaterial(String titulo){
        for(MaterialBiblioteca m : materiais){
            if(m.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(m.getInformacao()); // corrigido
                return;
            }
        }
        System.out.println("Material não encontrado.");
    }

    void listarTodosMateriais(){
        for(MaterialBiblioteca m : materiais){
            System.out.println("--------------------");
            System.out.println(m.getInformacao()); // corrigido
        }
    }
}