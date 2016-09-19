/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Jugador;
import java.util.Scanner;
import data.Tablero;

/**
 *
 * @author Juansebastian
 */
public class UI {
    
    private static Scanner entrada = new Scanner(System.in);
    
    public static void imprimirIntro(Jugador jugador1, Jugador jugador2, Tablero tablero){
        
        System.out.println("-----TicTacToe-----");
        
        System.out.println();
        
        System.out.print("Jugador 1 -> ");
        System.out.println(jugador1);
        System.out.print("Jugador 2 -> ");
        System.out.println(jugador2);
        System.out.println();
        System.out.println();
        
        System.out.println("El jugador "+ jugador1.getJugador()+" empieza: ");
        imprimirTablero(tablero); //Imprimimos el tablero

    }
    
    public static int movimiento(Tablero tablero, char valor){
        
        int mov; 
        
        System.out.println("Turno del jugador "+ valor);
        System.out.println("Seleccione un valor (1-9) para realizar su movimiento");
        
        mov = entrada.nextInt();
        
        
        return mov;
        
        
    }
    
    public static void imprimirError(int posicion){
        
            System.out.println("La posicion "+posicion+ " No existe o ya ha sido ocupada.");
            System.out.println("Intentelo de nuevo...");
        
    }
    
    public static void imprimirTablero(Tablero tablero) {
        tablero.pintarTablero();
    }
    
    public static void imprimirGanador(Jugador jugador) {
       
        System.out.println();
        System.out.println("\t El ganador es: " + jugador.getJugador()+" Felicidadees!!! :DD");
        System.out.println();
        
    }

    public static void imprimirEmpate() {
        
        System.out.println();
        System.out.println("\t\t Es un empate :( ");
        System.out.println();
       
    
    
}
    
}
