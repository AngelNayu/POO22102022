/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras;

/**
 *
 * @author genar
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Stack<Integer> PilaA = new Stack<Integer>(5);
        
        PilaA.push(35);
        PilaA.push(45);
        PilaA.push(25);
        PilaA.push(5);
        PilaA.push(2);
        System.out.println(PilaA.isFull());
        System.out.println(PilaA.isEmpty());
        System.out.println(PilaA.length());
        int dato = PilaA.pop();
        
        System.out.println("El elemento quitado es "+dato);
        System.out.println(PilaA.peek());
        System.out.println(PilaA.toString());
        
    }
    
    
}
