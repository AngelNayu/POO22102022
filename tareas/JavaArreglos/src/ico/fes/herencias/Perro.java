/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencias;

/**
 *
 * @author genar
 */
public class Perro {
    private String raza;
    private String color;
    private int edad;

    public Perro() {
    }

    public Perro(String raza, String color, int edad) {
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
}
