
package Modelo;

/**
 *
 * @author DELL
 */
public class Trabajador {
    
    private String nombre;
    private String puesto;
    private double sueldo;

    public Trabajador(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Puesto: " + puesto + ", Sueldo: " + sueldo;
    }
    
    publlic static int validaNumero(String input) {
        try {
            return Integer
        }
    }
}
