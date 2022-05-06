/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author genar
 */
public class Perro extends Animal{
    private String Raza;

    public Perro() {
    }

    public Perro(String Raza) {
        this.Raza = Raza;
    }

    public Perro(String Raza, int numeroPatas) {
        super(numeroPatas);
        this.Raza = Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "Raza=" + Raza + '}';
    }

    @Override
    public void hablar(){
        System.out.println("El perro de harza "+ this.Raza+ "Esta ladrando");
              System.out.println("Guau guau!!! ");
    }
    
    //Polimorfismo por el concepto de sobrecarga de metodos
    public void hablar(int veces){
        for (int i = 0; i < veces ; i++){
            System.out.print("Guau ");
        }
        System.out.println("!!!");
    }
}
