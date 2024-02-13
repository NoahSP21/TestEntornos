
import com.dam.gestorpalabras.GestorPalabras;
import static junit.framework.TestCase.*;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class GestorPalabrasTest {
    @Test
    public void TestContarVocales() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(4,c.contarVocales("ssiss"));

    }
    @Test
    public void TestPalabraInvertida() {
        GestorPalabras c = new GestorPalabras();
        assertEquals("y", c.invertirPalabra("yo"));
    }
}
