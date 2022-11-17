/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author genar
 * @param <T>
 */
public class ListaLigadaADT <T>{
    
    Nodo<T> Head;
    int tamanio;

    public ListaLigadaADT() {
    }
    
    public boolean vacio(){
        
        return this.Head== null;//comprueba si la lista se encuentra vacia
    }
    
    public int getTamanio(){
        return this.tamanio;  //regresa el tamaño
    }
    
    /**
     *
     * @param valor
     */
    public void agregarAlFinal(T valor){
        
        if (this.Head==null) {
            Head= new Nodo<>(valor);
        }
        else{
            Nodo<T> nuevo = Head;
            
            while (nuevo.getSiguiente() != null) {
                nuevo = nuevo.getSiguiente();               
            }
             nuevo.setSiguiente(new Nodo<>(valor));
        }
    }
 
}
