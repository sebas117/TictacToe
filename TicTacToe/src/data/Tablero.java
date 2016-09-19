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
public class Tablero {
    
    private Casilla[][] tablero;
    
    public Tablero(){
    
        tablero = new Casilla[3][3];
        char valor = '0'; //Iniciamos los valores predeterminados
        
        for(int i=0; i<tablero.length; i++){
            for(int j=0; j<tablero.length; j++){
            
            Casilla casilla = new Casilla(i,j, (char) (++valor));   //Todas las casillas las iniciamos vacias
            tablero[i][j] = casilla;
            }
    }
    }
    public Casilla[][] getTablero() {
        return tablero;
    }
    
    public void actualizarCasilla(Casilla casilla){
        
        tablero[casilla.getFila()][casilla.getColumna()] = casilla;
    }
    
    public void pintarTablero(){
       System.out.println( "\n\n" );
        System.out.println(  "\n\n" );
        System.out.println(  "\n\n\t\t" + tablero[0][0].getValor() + "   | " +tablero[0][1].getValor()+ "  | " +tablero[0][2].getValor());
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + tablero[1][0].getValor() + "   | " +tablero[1][1].getValor()+ "  | " +tablero[1][2].getValor());
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + tablero[2][0].getValor() + "   | " +tablero[2][1].getValor()+ "  | " +tablero[2][2].getValor());
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  "\n\n" );
        
    }
    
    
}