/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author genar
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void comer(){
        System.out.println("comiendo... ");
        System.out.println("ñam ñam");
    }
    
    public void correr(){
        System.out.println("corriendo");
    }
    public void dormir(){
        System.out.println("Durmiendo");
        System.out.println("zzzzz....");
    }
}
