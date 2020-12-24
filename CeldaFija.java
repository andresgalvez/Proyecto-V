/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.v;

/**
 *
 * @author AndresGalvez
 */
public class CeldaFija extends CeldaAbstracta{
 
    public CeldaFija(int fila, int columna, double x, double y) {
        super(fila, columna, x, y);
        //imagen = new ImageView(imagenDeCelda) ;
        //getChildren().addAll(imagen) ;
    }

    @Override
    public boolean quitarJugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean colocarJugador(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean quitarCaja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean colocarCaja(Caja caja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Caja getCaja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
    
}
