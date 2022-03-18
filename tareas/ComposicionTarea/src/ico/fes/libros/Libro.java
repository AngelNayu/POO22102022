/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libros;

import ico.fes.contenido.Autor;
import ico.fes.contenido.Editorial;

/**
 *
 * @author genar
 */
public class Libro {
    private String titulo;
    private String genero;
    private int paginas;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, String genero, int paginas, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", genero=" + genero + ", paginas=" + paginas + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void abrir(){
        System.out.println("El libro: ");
        System.out.println(this.titulo + " ha sido abierto");
    }
    
}
