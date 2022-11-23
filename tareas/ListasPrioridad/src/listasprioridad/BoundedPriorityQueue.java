/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasprioridad;

import java.util.ArrayList;

/**
 *
 * @author genar
 */
public class BoundedPriorityQueue<T> {
    ArrayList<Queue<T>> data;
    int size;

    public BoundedPriorityQueue(int niveles) {
        this.size = 0;
        data = new ArrayList<Queue<T>>();
        for (int i = 0; i < niveles; i++) {
            data.add(new Queue<T>());
        }
    }
    
    public boolean is_empty(){
        return this.size == 0;
    }
    
    public int length(){
        return this.size;
    }
    
    public void enqueue(int prioridad, T elemento){
        if(prioridad >= 0 && prioridad < data.size()){
            data.get(prioridad).enqueue(elemento);
            this.size++;
        }
    }
    
    public T dequeue(){
        if (!this.is_empty()) {
            for (Queue<T> queue : data) {
                if (!queue.is_empty()) {
                    this.size--;
                    return queue.dequeue();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
       String str= "";
       
        for (int i = 0; i < data.size(); i++) {
            if (this.data.get(i).is_empty()) {
                str += String.valueOf(i)+ "." +this.data.get(i).getData()+"\n";
            }else{
                str += String.valueOf(i)+ "." +this.data.get(i).toString()+"\n";
            }
        }
        return str;
    }
    
    
   
}
