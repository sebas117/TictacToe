/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import data.Jugador;
import data.Tablero;
import ui.UI;

/**
 *
 * @author Juansebastian
 */
public class Main {

    public static Jugador jugador1;
    public static Jugador jugador2; //Humano o bot
    public static Tablero tablero;

    public static void main(String[] args) {

        jugador1 = new Jugador('X', 0, true);
        jugador2 = new Jugador('O', 0, true);

        tablero = new Tablero();
        UI.imprimirIntro(jugador1, jugador2, tablero);
        jugar();    //EL jugador 1 empieza

    }

    public static void jugar() {

        Jugador jugadorActual = null;
        boolean isTie = false;
        boolean isWinner = false;

        do {
            jugadorActual = getJugadorActual(jugadorActual);    //Actualiza el jugador actual
            tablero = ControlTurno.jugarTurno(tablero, jugadorActual);  //Actualizamos el Tablero para el jugador actual

            // Evaluamos si en algun momento se gana o se empata
            if (ControlMovimiento.esGanador(tablero, jugadorActual)) {
                UI.imprimirGanador(jugadorActual);
                isWinner = true;
            } else{ if (ControlMovimiento.casillaLibre(tablero, jugador1, jugador2)) {

                UI.imprimirEmpate();
                isTie = true;
            }
            }
        } while (!isWinner && !isTie);

    }

    private static Jugador getJugadorActual(Jugador jugadorActual) {

        if (jugadorActual == null) {
            return jugador1;
        } else {
            if(jugadorActual == jugador1){
            return jugador2;
            }
            else
                return jugador1;
        }
    }
}
