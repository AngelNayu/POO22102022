/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.contenido;

/**
 *
 * @author genar
 */
public class Editorial {
    private String nombre;
    private String pais;
    private int cpostal;

    public Editorial() {
    }

    public Editorial(String nombre, String pais, int cpostal) {
        this.nombre = nombre;
        this.pais = pais;
        this.cpostal = cpostal;
    }

    public int getCpostal() {
        return cpostal;
    }

    public void setCpostal(int cpostal) {
        this.cpostal = cpostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", pais=" + pais + ", cpostal=" + cpostal + '}';
    }
    
    
}
