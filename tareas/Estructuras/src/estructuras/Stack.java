/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.util.ArrayList;

/**
 *
 * @author genar
 * @param <T>
 */
public class Stack <T>{
    ArrayList<T> data;
    int tope;
    int limite;

    public Stack() {
        data = new ArrayList<T>();
        tope= 0;
        limite = 0;
        
    }
    
    public Stack(int limite){
        data = new ArrayList<T>();
        tope= 0;
        this.limite= limite;
    }
    
    public boolean isFull(){//metodo para acuando se le aplique un limite a la pila
        if (limite ==0) {
            return false;
        }
        return tope == limite;
    }
    public void push(T valor){//metodo para agragar un elemento al tope de la pila
        if(!this.isFull()){
            data.add(valor);
            tope++;
        }
        else{
            System.out.println("\nEl stack se encuentra lleno \n");
        }
    }
     public boolean isEmpty(){//metodo en el que revisa si esta vacia la pila
         return this.tope ==0;
     }
     
     public int length(){//regresa el numero de elementos que contiene la pila
         return tope;
     }
     
     public T pop(){//saca el ultimo elemento y lo guarda y lo muestra
         T dato = data.get(tope-1);
         data.remove(tope-1);
         tope--;
         return dato;
     }
     
     public T peek(){// consulta el elemento de hasta arriba en la pila pero sin sacarlo
         return data.get(tope-1);
     }
     
     @Override
     
     public String toString(){ //regresa el estado actual de la pila 
         String str= "";
         for (int i = tope-1; i >= 0; i--) {
             str+= "|"+data.get(i)+"| \n";
         }
         return str;
     }
    
}
