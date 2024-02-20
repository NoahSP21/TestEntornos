
import com.dam.mavened.Calculadora;
import com.dam.mavened.Checked;
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
public class CalculadoraTest {
    @Test
    public void sumarEnteros(){
        Calculadora calc = new Calculadora();
        assertEquals(4 , calc.sumar(2, 2));
    }
    
    @Test
    public void prueba() throws Exception{
        Checked chk = new Checked();
        assertTrue(chk.check(25));
        assertFalse(chk.check(8));
    }
    
    @Test(expected = Exception.class)
    public void menorZero() throws Exception{
        Checked chk = new Checked();
        chk.check(-1);
    }
}
