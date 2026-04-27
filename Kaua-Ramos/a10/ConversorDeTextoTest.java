import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorDeTextoTest {

    private ConversorDeTexto conversor;

    @BeforeEach
    void setup() {
        // Instancia a classe sob teste antes de cada caso
        conversor = new ConversorDeTexto();
    }

    // -------------------------
    // capitalizarPalavras
    // -------------------------

    @Test
    void capitalizarPalavrasTest() {
        // String
        String entrada = "java é divertido";
        //ação
        String resultado = conversor.capitalizarPalavras(entrada);
        // Assert
        assertEquals("java É Divertido", resultado);
    }

    @Test
    void capitalizarPalavrasExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> conversor.capitalizarPalavras(null));
        assertThrows(IllegalArgumentException.class, () -> conversor.capitalizarPalavras("   "));
    }

    // -------------------------
    // inverterPalavras
    // -------------------------

    @Test
    void inverterPalavrasTest() {
        // String
        String entrada = "ola mundo bonito";
        //ação
        String resultado = conversor.inverterPalavras(entrada);
        // Assert
        assertEquals("bonito mundo ola", resultado);
    }

    @Test
    void inverterPalavrasExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> conversor.inverterPalavras(null));
        assertThrows(IllegalArgumentException.class, () -> conversor.inverterPalavras("   "));
    }

    // -------------------------
    // contarVogais
    // -------------------------

    @Test
    void contarVogaisTest() {
        // String
        String entrada1 = "BanAna";
        String entrada2 = "rhythms";
        //ação
        int qtd1 = conversor.contarVogais(entrada1); //deve retornar 3 vogais
        int qtd2 = conversor.contarVogais(entrada2);  // deve retornar 0 vogais
        // assertAll permite executar varios assertEquals simultaneamente
        assertAll(
            ()->assertEquals(3, qtd1),
            ()->assertEquals(0, qtd2),
            ()->assertThrows(IllegalArgumentException.class,()->conversor.contarVogais(null)) //assertThrows pede 2 argumentos
        );
    }

    @Test
    void ehPalindromoTest() {
    assertTrue(conversor.ehPalindromo("arara"));
    assertFalse(conversor.ehPalindromo("java"));
    assertFalse(conversor.ehPalindromo(null));
}

   @Test
    void removerPalavrasCurtasTest() {
    String resultado = conversor.removerPalavrasCurtas("hoje é um lindo dia", 3);
    assertEquals("hoje lindo dia", resultado);
}

    @Test
    void contarPalavrasTest() {
    int resultado = conversor.contarPalavras("Java é muito legal");
    assertEquals(4, resultado);
}

    @Test
    void inverterLetrasPorPalavraTest() {
    String resultado = conversor.inverterLetrasPorPalavra("java é legal");
    assertEquals("avaj é lageL", resultado);
}
}