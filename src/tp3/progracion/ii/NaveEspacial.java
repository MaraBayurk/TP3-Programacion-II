/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.progracion.ii;

/**
 *
 * @author marabayurk
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= MAX_COMBUSTIBLE) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(double distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Combustible recargado al máximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Combustible recargado: " + cantidad + " unidades.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("-------------------------");
    }
  public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("MaraStar", 50);

        nave1.despegar();
        nave1.avanzar(45);
        nave1.recargarCombustible(30);
        nave1.avanzar(45);

        System.out.println("\nEstado final de la nave:");
        nave1.mostrarEstado();
    }
}
