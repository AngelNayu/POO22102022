/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasprioridad;

import java.util.ArrayList;

/**
 *
 * @author genar
 * @param <T>
 */
public class Queue<T> {
    ArrayList<T> cola;
    int tamanio;

    public Queue() {
        cola = new ArrayList<T>();
        tamanio = 0;
    }
    
    public boolean is_empty(){//metodo para ver si esta vacia la cola, osease si contienen algun elemento
        return this.tamanio== 0;
    }
    
    public int length(){
        return this.tamanio;
    }
    
    public void enqueue(T elem){
        cola.add(elem);
        tamanio++;
    }
    
    public T dequeue(){
        T dato = cola.get(0);
        cola.remove(0);
        tamanio--;
        return dato;
    }

    @Override
    public String toString() {
        String str= "";
        for (int i = 0; i < this.tamanio; i++) {
            str += "|"+ cola.get(i)+"-->";
        }
        
        return str;
    }
    
    public ArrayList<T> getData(){
        return cola;
    }
    
    
}
