/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

/**
 *
 * @author genar
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TablasHashADT prueba = new TablasHashADT(7);
       prueba.add(7, "cafe");
       prueba.add(22, "salsa");
       prueba.add(58, "7");
       prueba.add(10,"89");
       prueba.add(39, "CDMX");
       prueba.add(33, "molde");
       prueba.add(20, "dedal");
       
       prueba.valueOf(7);
       prueba.valueOf(22);
       prueba.valueOf(20);
       prueba.valueOf(58);
       prueba.valueOf(10);
       prueba.valueOf(39);
       prueba.valueOf(33);
           
    }
    
}
