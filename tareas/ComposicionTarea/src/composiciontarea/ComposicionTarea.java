/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composiciontarea;

import ico.fes.contenido.Autor;
import ico.fes.contenido.Editorial;
import ico.fes.libros.Libro;

/**
 *
 * @author genar
 */
public class ComposicionTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro();
        libro1.setTitulo("Las aventuras de Tom Sawyer");
        libro1.setGenero("Ficcion de Aventuras");
        libro1.setPaginas(142);
        libro1.setAutor(new Autor("Mark twain", "Estadounidense", 74));
        Editorial edit1 = new Editorial();
        edit1.setNombre("DEBOLSILLO");
        libro1.setEditorial(edit1);
        
        libro1.getEditorial().setCpostal(9888);
        libro1.getEditorial().setPais("Mexico");
        
        System.out.println(libro1);
        libro1.abrir();
        
        
    }
    
}
