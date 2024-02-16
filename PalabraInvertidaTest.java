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
    public void invertirPalabraTest(){
        GestorPalabras gp = new GestorPalabras();
        assertEquals("hello", gp.invertirPalabra("olleh"));
        assertEquals("10loL", gp.invertirPalabra("Lol01"));
        assertEquals("sccs olol", gp.invertirPalabra("lolo" + " " + "sccs"));
        assertEquals("ihihih", gp.invertirPalabra("hihihi "));
        assertEquals("ihihih", gp.invertirPalabra("hihihi"));
    }
}
