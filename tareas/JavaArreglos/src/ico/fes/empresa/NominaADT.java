/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.empresa;

import ico.fes.herencias.Arreglo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author genar
 */
public class NominaADT {
    private String nombreEmpresa;
    private Arreglo<Empleado> nomina;
    private String rutaArchivo;
    
    
    
    public NominaADT(String ruta) throws IOException{
        this.rutaArchivo = ruta;
        int contador = 0;
        String linea; 
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("junio.dat"));
          linea = br.readLine();
            while (linea != null) {   
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
