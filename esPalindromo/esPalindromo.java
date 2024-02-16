/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maven;

import com.mycompany.Exceptions.DigitException;
import com.mycompany.Exceptions.LowNumberException;

/**
 *
 * @author dev
 */
public class esPalindromo {

    public boolean esPalindromo(String palabra) {
        String palabraFormateada = palabra.replaceAll("\\s+", "").toLowerCase();
        
        for (int i = 0; i < palabraFormateada.length() / 2; i++) {
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
