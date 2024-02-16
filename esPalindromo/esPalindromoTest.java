
import com.mycompany.maven.GestorPalabras;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class esPalindromoTest {

    @Test
    public void esPalindromoTrue()  {
        GestorPalabras c = new GestorPalabras();
        assertTrue(c.esPalindromo("madam"));
    }
}
