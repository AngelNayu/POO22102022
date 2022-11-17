/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasADT;

/**
 *
 * @author genar
 * @param <T>
 */
public class listaLigadaADT <T>{
    Nodo<T> head;
    int tamanio;

    public listaLigadaADT() {
    }
    
    public boolean vacio(){
        
        return this.head== null;//comprueba si la lista se encuentra vacia
    }
    
    public int getTamanio(){
        return this.tamanio;  //regresa el tamaño
    }
    
    /**
     *
     * @param valor
     */
    public void agregarAlFinal(T valor){
        
        if (this.head==null) {
            head= new Nodo<>(valor);
        }
        else{
            Nodo<T> nuevo = head;
            
            while (nuevo.getSiguiente() != null) {
                nuevo = nuevo.getSiguiente();               
            }
             nuevo.setSiguiente(new Nodo<>(valor));
        }
    }
}
