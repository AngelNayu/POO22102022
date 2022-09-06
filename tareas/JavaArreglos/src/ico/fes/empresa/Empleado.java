/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.empresa;

/**
 *
 * @author genar
 */
public class Empleado {
    public static final double VALOR_HORAS_EXTRA = 276.5;
    public static final double PRESTACION_ANTIGUEDAD = 0.03;
    private int edad;
    private String nombre;
    private String paterno;
    private String materno;
    private double sueldoBase;
    private int horasExtra;
    private int anioingreso;

    public Empleado() {
    }

    public Empleado(int edad, String nombre, String paterno, String materno, double sueldoBase, int horasExtra, int anioingreso) {
        this.edad = edad;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
        this.anioingreso = anioingreso;
    }

    public int getAnioingreso() {
        return anioingreso;
    }

    public void setAnioingreso(int anioingreso) {
        this.anioingreso = anioingreso;
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

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        return "Empleado{" + "edad=" + edad + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", sueldoBase=" + sueldoBase + ", horasExtra=" + horasExtra + ", anioingreso=" + anioingreso + '}';
    }
    
    public double calcularSueldo(){
        double prestacion=(2022-this.anioingreso)*this.PRESTACION_ANTIGUEDAD;
        double he = this.horasExtra * this.VALOR_HORAS_EXTRA;
        return this.sueldoBase + prestacion + he;
    }
}
