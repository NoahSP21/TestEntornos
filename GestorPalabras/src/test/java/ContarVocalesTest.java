
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
        assertEquals(4,c.contarVocales("aaayyys"));
        assertEquals(10,c.contarVocales("pepe tiene un tractor"));
    }
    //tiene que fallar 
    @Test
    public void TestContarVocales() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(1,c.contarVocales("ssiss"));
        assertEquals(1,c.contarVocales("hay"));
        assertEquals(8,c.contarVocales("yooo kamekamehahhh"));
        assertEquals(6,c.contarVocales("allí esta papá"));
        assertEquals(4,c.contarVocales("pingüino"));        
    }
    //tiene que aceptarlo

}
