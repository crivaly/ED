/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emagic.modelo;

/**
 *
 * @author crivaly
 */
public class Palabra {
    private final StringBuilder palabra;
    private final StringBuilder guiones;
    private final Fichero fichero;

    public Palabra() {
        fichero = new Fichero();
        palabra = new StringBuilder(fichero.damePalabra());
        guiones = new StringBuilder();
        palabraAguiones();        
    }

    private void palabraAguiones() {
        for (int i = 0; i < palabra.length(); i++) {
            guiones.append('-');
        }

    }

    public boolean pruebaLetra(char letra) {
        boolean aux = false;
        char letraMayuscula = Character.toUpperCase(letra);

        for (int i = 0; i < guiones.length(); i++) {
            if (palabra.charAt(i) == letraMayuscula) {
                guiones.deleteCharAt(i);
                guiones.insert(i, letraMayuscula);
                aux = true;
            }
        }
        return aux;
    }

    public String getGuiones() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < guiones.length(); i++) {
            s.append(guiones.charAt(i));
            s.append(" ");

        }
        return s.toString();
    }

    public boolean ganador() {
        if (guiones.indexOf("-") == -1) {
            return true;
        } else {
            return false;
        }
    }
}
