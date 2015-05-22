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
public class Fichero {
    private final String palabraSeleccionada;

    public Fichero() {
        palabraSeleccionada = "";
    }
    
    /**
     * Devuelve una palabra buscada en un fichero de forma aleatoria
     * @return Palabra aleatoria
     */
    public String damePalabra() {
        return "otorrinolaringologo".toUpperCase();
       
    }
}
