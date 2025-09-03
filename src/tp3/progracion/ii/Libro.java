/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.progracion.ii;

/**
 *
 * @author marabayurk
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    
    public void setAñoPublicacion(int año) {
        if (año > 0) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año inválido. No se actualizó.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
    
    public static void main(String[] args) {
        Libro miLibro = new Libro("El sueño del Mar", "Antony Doux", 1973);

        System.out.println("Información inicial:");
        miLibro.mostrarInfo();

        miLibro.setAñoPublicacion(-2020);

        miLibro.setAñoPublicacion(2020);

        System.out.println("\nInformación final:");
        miLibro.mostrarInfo();
    }

}
