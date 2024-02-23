
import com.mycompany.Exceptions.DigitException;
import com.mycompany.Exceptions.LowNumberException;
import com.mycompany.maven.GestorPalabras;
import static junit.framework.Assert.*;
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
    
    //TEST DE PALÍNDROMO
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

    @Test
    public void esPalindromoConTildeTrue() throws LowNumberException, DigitException {
        GestorPalabras c = new GestorPalabras();
        assertTrue(c.esPalindromo("mádam"));
    }
    
    @Test
    public void invertirPalabraTest1() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("hello", gp.invertirPalabra("olleh"));
    }

    @Test
    public void invertirPalabraTest2() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("10loL", gp.invertirPalabra("Lol01"));
    }

    @Test
    public void invertirPalabraTest3() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("sccs olol", gp.invertirPalabra("lolo" + " " + "sccs"));
    }

    @Test
    public void invertirPalabraTest4() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(" ihihih", gp.invertirPalabra("hihihi "));
    }

    @Test
    public void invertirPalabraTest5() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("ihihih", gp.invertirPalabra("hihihi"));
    }

    @Test
    public void invertirPalabraTest1Letter() throws Exception {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("a", gp.invertirPalabra("a"));
    }
    
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
