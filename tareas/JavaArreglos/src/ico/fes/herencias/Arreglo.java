/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencias;

import java.util.AbstractList;
import java.util.List;

/**
 *
 * @author genar
 */
public class Arreglo  {
   
    int tamanio;
    int longitud;
    int elemento;
    int indice;
    String valor;

    public Arreglo() {
    }

    public Arreglo(int tamanio, int longitud, int elemento, int indice, String valor) {
        this.tamanio = tamanio;
        this.longitud = longitud;
        this.elemento = elemento;
        this.indice = indice;
        this.valor = valor;
    }

    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public int getlongitud(){
        return 0;
    }
    
    public void setElemento(int indice,String valor ){
        
    }
    public int getElemento(int indice){
        return 0;
    }
    
    public void clear(int valor){
        
    }

    @Override
    public String toString() {
        return "Arreglo{" + "tamanio=" + tamanio + ", longitud=" + longitud + ", elemento=" + elemento + ", indice=" + indice + ", valor=" + valor + '}';
    }
    
    
}
