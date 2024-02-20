
import com.mycompany.Exceptions.DigitException;
import com.mycompany.Exceptions.LowNumberException;
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
    public void esPalindromoTrue() throws LowNumberException, DigitException{
        GestorPalabras c = new GestorPalabras();
        assertTrue(c.esPalindromo("madam"));
    }
    
    @Test 
    public void esPalindromoFalse() throws LowNumberException, DigitException{
        GestorPalabras c = new GestorPalabras();
        assertFalse(c.esPalindromo("casa"));
    }
    
    @Test(expected = LowNumberException.class)
    public void esPalindromoVacio() throws LowNumberException, DigitException{
        GestorPalabras c = new GestorPalabras();
        assertTrue(c.esPalindromo(""));
    }
    
    @Test(expected = LowNumberException.class)
    public void palindromo1Letra() throws LowNumberException, DigitException{
        GestorPalabras c = new GestorPalabras();
        assertTrue(c.esPalindromo("a"));
    }

    @Test (expected = DigitException.class)
    public void palindromo_Num() throws DigitException, LowNumberException{
        GestorPalabras c = new GestorPalabras();
        assertTrue(c.esPalindromo("0p"));
    }

    @Test(expected = NullPointerException.class)
    public void palindromoNull() throws NullPointerException, LowNumberException, DigitException {
        GestorPalabras c = new GestorPalabras();
        assertTrue(c.esPalindromo(null));
    }
}
