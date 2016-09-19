/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Juansebastian
 */
public class Jugador {
    
    private char jugador; //X o O
    private final boolean jugadorHumano;
    private int puntaje;

    public Jugador(char jugador, int puntaje, boolean jugadorHumano) {
        this.jugador = jugador;
        this.puntaje = puntaje;
        this.jugadorHumano= jugadorHumano;
    }

    public char getJugador() {
        return jugador;
    }

    public void setJugador(char jugador) {
        this.jugador = jugador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public boolean getJugadorHumano(){
        
        return this.jugadorHumano;
    }
    
    //TO STRING

    @Override
    public String toString() {
        
        String imprimirJugador;
        imprimirJugador = jugador + " Yo soy un ";
        
        if(this.getJugadorHumano())
            imprimirJugador = imprimirJugador.concat("humano");
        else
            imprimirJugador = imprimirJugador.concat("Bot");
        
        return imprimirJugador + " Mi puntaje es: "+ puntaje;
    }
    
    
    
    
}
