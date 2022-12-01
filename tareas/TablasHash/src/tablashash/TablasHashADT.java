/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

import java.util.ArrayList;

/**
 *
 * @author genar
 */
public class TablasHashADT {
    int key;
    int tableSize;
    String dato;
    int posicion;
    Object [] tabla;

    public TablasHashADT(int tableSize) {
        this.tableSize= tableSize;
        
        tabla = new Object[tableSize];
    }
    
    public void add(int key, String dato){
        this.key = key;
        this.dato= dato;
        this.posicion= key%tableSize;
        
        tabla[posicion]= dato;
        
    }
    
    public void valueOf(int key){
        this.posicion= key%tableSize;
        System.out.println("El valor asociado a la llave "+key +" es ---->"+"Posicion "+this.posicion+" y el dato que contiene es "+ tabla[posicion]);
    }
    public void remove(int key){
        this.posicion = key%tableSize;
        
        tabla[posicion]= null;
    }
    
    
}
