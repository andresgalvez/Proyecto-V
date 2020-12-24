/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.v;

import javafx.scene.image.ImageView;

/**
 *
 * @author AndresGalvez
 */
public class Jugador extends ImageView {
    private int fila;
    private int columna;

    public Jugador(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        //setImage(jugador);
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
    
}
