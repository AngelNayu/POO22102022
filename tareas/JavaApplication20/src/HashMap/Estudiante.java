
package HashMap;

public class Estudiante {
    private int id;
    private int edad;
    private String apellido;

    public Estudiante() {
    }

    public Estudiante(int id, int edad, String apellido) {
        this.id = id;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", edad=" + edad + ", apellido=" + apellido + '}';
    }
    
}
