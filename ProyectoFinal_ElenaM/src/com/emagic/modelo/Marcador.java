/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emagic.modelo;

import java.util.ArrayList;

/**
 *
 * @author crivaly
 */
public class Marcador {
    private final ArrayList<Character> listaFallos;
    private final ArrayList<Character> listaAciertos;
    private int intentos;

    public Marcador() {
        listaFallos = new ArrayList();
        listaAciertos = new ArrayList();
        intentos = 0;
    }

    public String getListaAciertos() {
        return listaAciertos.toString();
    }

    public String getListaFallos() {
        return listaFallos.toString();
    }

    public int getIntentos() {
        return intentos;
    }
    
    public void addAcierto(char c){
        listaAciertos.add(Character.toUpperCase(c));
    }
    
    public void addFallos(char c){
        listaFallos.add(Character.toUpperCase(c));
    }
    
    public void addIntentos () {
        intentos++;
    }
    
    public int cuentaFallos() {
        return listaFallos.size()-1;
    }
}
