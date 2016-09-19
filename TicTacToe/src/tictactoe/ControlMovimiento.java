/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Juansebastian
 */

package tictactoe;

import data.Jugador;
import data.Tablero;
import data.Casilla;

public class ControlMovimiento {

    public static boolean esGanador(Tablero tablero, Jugador jugador) {

        boolean jugadorGanador;

        //Evaluar Filas
        for (int i = 0; i < tablero.getTablero().length; i++) {

            jugadorGanador = true;
            for (int j = 0; j < tablero.getTablero().length; j++) {

                if (tablero.getTablero()[i][j].getValor() != jugador.getJugador()) {
                    jugadorGanador = false;
                }
            }

            if (jugadorGanador) {
                return jugadorGanador;
            }

        }

        //Evaluar Columnas
        for (int i = 0; i < tablero.getTablero().length; i++) {

            jugadorGanador = true;
            for (int j = 0; j < tablero.getTablero().length; j++) {

                if (tablero.getTablero()[j][i].getValor() != jugador.getJugador()) {
                    jugadorGanador = false;
                }
            }

            if (jugadorGanador) {
                return jugadorGanador;
            }

        }

        //Evaluar Diagonal 1
        jugadorGanador = true;
        for (int i = 0; i < tablero.getTablero().length; i++) {

            if (tablero.getTablero()[i][i].getValor() != jugador.getJugador()) {
                jugadorGanador = false;
            }

        }
        if (jugadorGanador) {
            return jugadorGanador;
        }

        //Evaluar Diagonal 2
        jugadorGanador = true;
        for (int i = tablero.getTablero().length -1 ; i >= 0; i--) {

            if (tablero.getTablero()[i][i].getValor() != jugador.getJugador()) {
                jugadorGanador = false;
            }
        }
        if (jugadorGanador) {
            return jugadorGanador;
        }

        return jugadorGanador; // Si llega a este punto es falso
    }
    
    public static boolean  movValido(Tablero tablero, int pos){
        
        if(pos<1 || pos>9)
            return false;
        
        //Evaualuamos sin en alguna posicion del tabler esta ya puesto 'X' o 'O'
        int fila = (pos- 1) / 3;
        int col = (pos - 1) % 3;

        if (tablero.getTablero()[fila][col].getValor() != 'X' && tablero.getTablero()[fila][col].getValor() != 'O') {
            return true;
        } else {
            return false;
        
    }
    }
    
    
    public static boolean casillaLibre(Tablero tablero, Jugador jugador1, Jugador jugador2){
        
        for(int i = 0; i<tablero.getTablero().length; i++){
            for(int j=0; j<tablero.getTablero().length; j++){
                
                if(tablero.getTablero()[i][j].getValor()!= jugador1.getJugador() &&
                        tablero.getTablero()[i][j].getValor()!= jugador2.getJugador()){
                    
                    return false;    //Existe al menos uno que no esta ocupado
                }
                
                
            }
        }
        
        return true;
    }


}