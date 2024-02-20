/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.dam.gestorpalabras.GestorPalabras;
import static junit.framework.TestCase.*;
import org.junit.Test;

/**
 *
 * @author dev
 */
public class PalabraInvertidaTest {

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
}
