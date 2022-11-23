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
        
        
        System.out.println("------------------------");
        System.out.println("");
        
        System.out.println("Listas de prioridad Acotada ");
        
        
        
        BoundedPriorityQueue<Integer> colaPrioridad = new BoundedPriorityQueue<Integer>(6);
        colaPrioridad.enqueue(5, 45);
        colaPrioridad.enqueue(4, 50);
        colaPrioridad.enqueue(0, 25);
        colaPrioridad.enqueue(5, 12);
        colaPrioridad.enqueue(3, 13);
        colaPrioridad.enqueue(0, 14);
        colaPrioridad.enqueue(2, 20);
        
        System.out.println(colaPrioridad.is_empty());
        System.out.println("hay "+colaPrioridad.length()+" elementos en la cola");
        System.out.println(colaPrioridad.toString());
        
        System.out.println("");
        int eliminado= colaPrioridad.dequeue();
        System.out.println("el elemento quitado de la cola es "+ eliminado);
        
        System.out.println("");
        
        System.out.println("El estado actual de la cola es: ");
        System.out.println(colaPrioridad.toString());
        
        
        
        
    }
    
}
