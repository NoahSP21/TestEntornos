/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.maven;

import com.mycompany.Exceptions.*;
import java.text.Normalizer;
/**
 *
 * @author dev
 */
public class GestorPalabras {

    public boolean esPalindromo(String palabra) throws LowNumberException, DigitException {
        String palabraFormateada = Normalizer.normalize(palabra, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("\\s+", "").toLowerCase();
        if (palabra.length() <= 1) {
            throw new LowNumberException("Has de introducir una palabra de menos de 1 letra");
        } else {
            for (int i = 0; i < palabraFormateada.length(); i++) {
                if (Character.isDigit(palabra.charAt(i))) {
                    throw new DigitException("Has introducido un número");
                }
            }
            for (int i = 0; i < palabraFormateada.length() / 2; i++) {
                if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

     public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            } else if (caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú' || caracter == 'ü') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 2; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
}
