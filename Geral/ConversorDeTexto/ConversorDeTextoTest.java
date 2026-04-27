import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

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
        assertEquals("Java É Divertido", resultado);
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

    // -------------------------
    // ehPalindromo
    // -------------------------

    @Test
    void ehPalindromoTest() {
        // String
        String entrada1 = "arara";
        String entrada2 = "java";
        //ação
        boolean resultado1 = conversor.ehPalindromo(entrada1); //deve retornar true
        boolean resultado2 = conversor.ehPalindromo(entrada2); //deve retornar false
        // Assert
        assertAll(
            ()->assertTrue(resultado1),
            ()->assertFalse(resultado2),
            ()->assertFalse(conversor.ehPalindromo(null)),
            ()->assertFalse(conversor.ehPalindromo("   "))
        );
    }

    // -------------------------
    // removerPalavrasCurtas
    // -------------------------

    @Test
    void removerPalavrasCurtasTest() {
        // String
        String entrada = "O Felipe Azoia eh chato";
        int tamanhoMinimo = 3;
        //ação
        String resultado = conversor.removerPalavrasCurtas(entrada, tamanhoMinimo);
        // Assert
        assertAll(
            ()->assertEquals("Felipe Azoia chato", resultado),
            ()->assertThrows(IllegalArgumentException.class,()->conversor.removerPalavrasCurtas(null, tamanhoMinimo))
        );
    }

    // -------------------------
    // substituirPalavra
    // -------------------------

    @Test
    void substituirPalavraTest() {
        // String
        String entrada = "O Felipe Azoia eh chato";
        String palavraAntiga = "chato";
        String palavraNova = "gênio";
        //ação
        String resultado = conversor.substituirPalavra(entrada, palavraAntiga, palavraNova);
        // Assert
        assertAll(
            ()->assertEquals("O Felipe Azoia eh gênio", resultado),
            ()->assertThrows(IllegalArgumentException.class,()->conversor.substituirPalavra(null, palavraAntiga, palavraNova)),
            ()->assertThrows(IllegalArgumentException.class,()->conversor.substituirPalavra(entrada, null, palavraNova)),
            ()->assertThrows(IllegalArgumentException.class,()->conversor.substituirPalavra(entrada, palavraAntiga, null))
        );
    }

    // -------------------------
    // contarPalavras
    // -------------------------

    @Test
    void contarPalavrasTest() {
        // String
        String entrada = "Java é muito legal adoro java";
        //ação
        int resultado = conversor.contarPalavras(entrada);
        // Assert
        assertAll(
            ()->assertEquals(6, resultado),
            ()->assertEquals(0, conversor.contarPalavras(null)),
            ()->assertEquals(0, conversor.contarPalavras("   "))
        );
    }

    // -------------------------
    // inverterLetrasPorPalavra
    // -------------------------

    @Test
    void inverterLetrasPorPalavraTest() {
        // String
        String entrada = "O Felipe Azoia eh chato";
        //ação
        String resultado = conversor.inverterLetrasPorPalavra(entrada);
        // Assert
        assertAll(
            ()->assertEquals("O epileF iazoA he otahc", resultado),
            ()->assertThrows(IllegalArgumentException.class,()->conversor.inverterLetrasPorPalavra(null)),
            ()->assertThrows(IllegalArgumentException.class,()->conversor.inverterLetrasPorPalavra("   "))
        );
    }
}
