/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectounidad2;

import java.util.ArrayList;



class CentrosCuadrados {
private int semilla;
private int numeros;
private int deci;
public static ArrayList<String> os;


    public int getSemilla() {
        return semilla;
    }

    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public int getDeci() {
        return deci;
    }

    public void setDeci(int deci) {
        this.deci = deci;
    }



    public CentrosCuadrados() {
    }

    public CentrosCuadrados(int semilla, int numeros, int deci) {
        this.semilla = semilla;
        this.numeros = numeros;
        this.deci = deci;
    }
}
