/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.v;

import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;

/**
 *
 * @author AndresGalvez
 */
public class Tablero {
    
    private int filas;
    private int columnas;
    private CeldaAbstracta[][] celdas; 
    private Jugador jugador;
    private void crearControladoresDeTeclado(StackPane escena){
        escena.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch(event.getCode()){
                    case UP:
                        moverJugadorArriba();
                        break;
                    case LEFT:
                        //moverJugadorIzquierda();
                        break;
                    case RIGHT:
                        //moverJugadorDerecha();
                        break;
                    case DOWN:
                        //moverJugadorDown();
                        break;    
                }    
            }
            
        });
    };
    
    
    private void moverJugadorArriba(){
        int filaJugador = jugador.getFila();
        int columnaJugador = jugador.getColumna();
        if(celdas[filaJugador - 1][columnaJugador] instanceof CeldaFija ){
            System.out.println("No es posible");
            //reproducir chocar !
        
        }else if(celdas[filaJugador - 1][columnaJugador] instanceof CaminoCelda || celdas[filaJugador - 1][columnaJugador] instanceof SalidaCelda ){
            if(!celdas[filaJugador - 1][columnaJugador].estaOcupada()){
                celdas[filaJugador ][columnaJugador].quitarJugador();
                celdas[filaJugador -1][columnaJugador].colocarJugador(jugador);
            }else{
                //moverCajaArriba;
            }   
        }
    
    }
}
