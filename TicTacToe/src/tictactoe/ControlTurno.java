/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import data.Casilla;
import data.Jugador;
import data.Tablero;
import ui.UI;

/**
 *
 * @author Juansebastian
 */
public class ControlTurno {
    
    public static Tablero jugarTurno(Tablero tablero, Jugador jugador){
        
        int posicion;
        boolean movValido;
        
         do {

            if (jugador.getJugadorHumano()) {
                posicion = UI.movimiento(tablero, jugador.getJugador());
            } else {
                posicion = 1;
            }
            movValido = ControlMovimiento.movValido(tablero, posicion);

            if (!movValido) {
                UI.imprimirError(posicion);
            } else {
                actualizarTablero(tablero, posicion, jugador.getJugador());
            }

            UI.imprimirTablero(tablero);

        } while (!movValido);

        return tablero;
         
    }
    
    public static Tablero actualizarTablero(Tablero tablero, int pos, char valor){
        
        Casilla casilla = new Casilla(pos, valor);
        tablero.actualizarCasilla(casilla);  //Actualizamos el tablero
        
        return tablero;
    }
    
    
    
    //METODO DEL BOT O CREAR UNA CLASE PROPIA DE BOT
    
}
