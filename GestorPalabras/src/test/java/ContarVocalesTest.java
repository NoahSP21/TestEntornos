
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
    @Test
    public void TestContarConsonantesEnFrase() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(10,c.contarVocales("pepe tiene un tractor"));
    }
    @Test
    public void TestContarConsonantesMayusTilde() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(6,c.contarVocales("LÉEME DESPACIO"));
    }
    //tienen que fallar 
    
    
    @Test
    public void TestContarVocales() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(1,c.contarVocales("ssiss"));
    }
    
    @Test
    public void TestContarVocalesConTilde() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(6,c.contarVocales("allí esta papá"));
    }
    
    @Test
    public void TestContarVocalesConDieresis() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(4,c.contarVocales("pingüino"));
    }
    
    @Test
    public void TestContarVocalesConTildesMayus() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(6,c.contarVocales("ALLÍ HAY PLÁTANOS"));
    }
    
    @Test
    public void TestContarVocalesConMayus() {
        GestorPalabras c = new GestorPalabras();
        assertEquals(5,c.contarVocales("VIVA LA PEPA"));
    }
    //tiene que aceptarlo
}

    


