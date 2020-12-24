/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.v;

import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 *
 * @author AndresGalvez
 */
public abstract class CeldaAbstracta extends StackPane {
    private int fila;
    private int columna;
    ImageView imagen;
    private boolean ocupada = false;
    
     public CeldaAbstracta(int fila, int columna, double x , double y) {
        this.fila = fila;
        this.columna = columna;
        setPrefHeight(50);
        setPrefWidth(50);
        setTranslateX(x);
        setTranslateY(y);
         
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

   public abstract boolean quitarJugador();
   public abstract boolean colocarJugador (Jugador jugador);
   public abstract boolean quitarCaja();
   public abstract boolean colocarCaja(Caja caja);
   public boolean estaOcupada(){
       return ocupada;
   };
   public void insertarObjeto(boolean ocupada){
       this.ocupada = ocupada;
   };
   public abstract Caja getCaja();
    
}
