/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author genar
 */
public class Cuentahabiente {
    private String idCliente;
    private String nombre;
    private float  balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero( float monto ){
        
        balance= balance-monto;
        System.out.println("el nuevo balance del cliente: "+ idCliente +" " + nombre+", es de: " +balance);
    }
    public String evaluarNivelCliente(){
        
        if (balance>50000) {
            System.out.println(idCliente+ " "+nombre+ " Usted es un CLIENTE PREMIUM");
        }else{
            System.out.println(idCliente+ " "+nombre+ " Usted es un CLIENTE REGULAR");
        }
        
        return null;
        
    }
}
