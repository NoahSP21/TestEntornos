
import com.dam.gestorpalabras.GestorPalabras;
import static junit.framework.TestCase.*;
import org.junit.Test;

/**
 *
 * @author dev
 */
public class ContarVocalesTest {
    @Test
    public void TestContarConsonantes() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(4,c.contarVocales("ssiss"));
    }
    //tiene que fallar 
    @Test
    public void TestContarVocales() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(1,c.contarVocales("ssiss"));
    }
    //tiene que aceptarlo
    @Test
    public void TestAceptaNum() {
       GestorPalabras c = new GestorPalabras();
        assertEquals(0,c.contarVocales(p3p3)); 
    }
//    public void TestPalabraInvertida() {
//        GestorPalabras c = new GestorPalabras();
//        assertEquals("y", c.invertirPalabra("yo"));
//    }
}
