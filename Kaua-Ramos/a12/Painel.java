import java.util.ArrayList;
import java.util.List;

public class Painel implements ComponenteGUI {

    private List<ComponenteGUI> componentes;

    public Painel() {
        componentes = new ArrayList<>();
    }

    // Adiciona componentes filhos
    public void adicionar(ComponenteGUI componente) {
        componentes.add(componente);
    }

    @Override
    public void renderizar(String identacao) {

        System.out.println(identacao + "Painel");

        // Renderiza os componentes filhos
        for (ComponenteGUI componente : componentes) {
            componente.renderizar(identacao + "   ");
        }
    }
}