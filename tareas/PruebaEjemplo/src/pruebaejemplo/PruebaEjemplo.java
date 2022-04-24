/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author genar
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuentahabiente cuenta1= new Cuentahabiente();
        cuenta1.setBalance(58744);
        cuenta1.setIdCliente("22001-4");
        cuenta1.setNombre("Andres");
        
        System.out.println(cuenta1);
        cuenta1.retirarDinero(40700);
        cuenta1.evaluarNivelCliente();
        
        System.out.println("-----.Ejemplo de Arreglos------");
        
        Cuentahabiente[] lista= new Cuentahabiente[5];
        lista[0] = new Cuentahabiente("10001", "Joselito", 40800);
        lista[1] = new Cuentahabiente("10002", "Luis", 58000);
        lista[2] = new Cuentahabiente("10003", "Pedro", 35000);
        lista[3] = new Cuentahabiente("10004", "Orlando", 89000);
        lista[4] = new Cuentahabiente("10005", "Jorge", 102000);
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente);
        }
         System.out.println("-----Resta de monto------");
        for (Cuentahabiente cuentahabiente : lista) {
            
            cuentahabiente.retirarDinero(18000);
            
        }
        System.out.println("-------Evaluacion de clientes-------");
        
        for (Cuentahabiente cuentahabiente : lista) {
            cuentahabiente.evaluarNivelCliente();
            
        }
    }
    
}
