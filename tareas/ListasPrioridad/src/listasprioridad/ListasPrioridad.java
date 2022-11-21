/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasprioridad;

/**
 *
 * @author genar
 */
public class ListasPrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> prueba = new Queue<Integer>();
        prueba.enqueue(10);
        prueba.enqueue(8);
        prueba.enqueue(5);
        prueba.enqueue(48);
        prueba.enqueue(12);
        
        System.out.println(prueba.is_empty());
        System.out.println(prueba.length());        
        System.out.println(prueba.toString());
        
        System.out.println("");
        
        int borrado= prueba.dequeue();
        System.out.println("El elemento que se ha quitado de la cola es "+ borrado);
        
        System.out.println("ahora se poseen "+prueba.length()+" elementos en la cola");
        
        System.out.println("");
        System.out.println("los elementos que aun quedan en la cola son "+ prueba.toString());
    }
    
}
