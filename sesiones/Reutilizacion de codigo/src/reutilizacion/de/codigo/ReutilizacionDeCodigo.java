/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacion.de.codigo;

import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipos.Computadora;
import ico.fes.iu.MiVentana;

/**
 *
 * @author genar
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String facultad= new String("FES Aragon"); 
        char letra = facultad.charAt(4);
        System.out.println(letra);
        
        //MiVentana v1 = new MiVentana();
        
        Computadora compu = new Computadora();
        compu.setMarca("Asus");
        compu.setModelo("VivoBook");
        compu.setCpu(new Procesador("intel", "i7", 5.0f));
        Mouse raton= new Mouse();
        raton.setMarca("Logitech");
        compu.setRaton(raton);
        
        compu.getRaton().setModelo("GS400");
        System.out.println( compu );
    }
    
}
