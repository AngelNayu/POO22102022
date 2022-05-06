/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.Figura;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author genar
 */
public class JavaBasico2210parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c= new Cuadrado(4.0f, 4.0f);
        Circulo cir= new Circulo(5.0f);
        
        System.out.println(c.calcularArea());
        System.out.println(cir.calcularArea());
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("1) cuadrado, 2) Ciruclo, 3) Triangulo, 4) Rectangulo\n escoge un numero: ");
        int opcion=teclado.nextInt(); //excepciones
        switch (opcion) {
            case Figura.CUADRADO:
                System.out.println(c.calcularArea());
                break;
            
            case Figura.CIRCULO:
                
                System.out.println(cir.calcularArea());
                break;
            
            case Figura.TRIANGULO:    
                //area triangulo
                break;
            
            case Figura.RECTANGULO: 
                //area rectangulo
                break;
                
            default:
            System.out.println("opcion no valida");

        }
        
        JOptionPane.showMessageDialog(null, "Hola", "El titulo", JOptionPane.ERROR_MESSAGE);
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setNombre("Daniela");
        eda.entrenar();
        eda.ensayar();
        eda.comer();
    }
    
}
