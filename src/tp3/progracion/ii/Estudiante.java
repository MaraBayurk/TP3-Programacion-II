/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.progracion.ii;

/**
 *
 * @author marabayurk
 */
public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
   
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Mara", "Bayurk", "Programacion", 7.5);

        System.out.println("Información inicial:");
        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(2.0);
        System.out.println("Después de subir calificación:");
        estudiante1.mostrarInfo();

        // Bajar calificación
        estudiante1.bajarCalificacion(5.0);
        System.out.println("Después de bajar calificación:");
        estudiante1.mostrarInfo();
    }
}