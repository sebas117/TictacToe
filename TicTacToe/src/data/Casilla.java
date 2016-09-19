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
public class Casilla {
    
    private int pos;
    private int fila;
    private int columna;
    private char valor;

    public Casilla(int fila, int columna, char valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
    public Casilla(int pos, char valor){    //Convertimos la pos, en terminos de la fila y la columna
        this.fila = (pos - 1) / 3;
        this.columna = (pos- 1) % 3;
        this.valor = valor;
    }

    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }
    
    public int getFila(){
        return this.fila;
    
    }
    public int getColumna(){
        return this.columna;
    }
    //toString
    public String toString() {
        return String.valueOf(this.getValor());
    }
    
}
