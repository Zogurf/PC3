/*
    Diseñar la clase Canción con notación UML.
    La clase debe tener los siguientes atributos: nombre, cantante, género y duración.
    Todos los atributos deben ser
    privados.
    Implementar la clase en Java.
    Crear los correspondientes
    getters y setters.
*/

package sem12;

public class libro {
    
    private String nombre;
    private String cantante;
    private String genero;
    private double duracion;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    /* Para iimprimirlo
    
    import java.util.Scanner;
    import Modelo.libro;
    
   public class EjecucionCancion {
    public static void main(String[] args) {
    
        Scanner lc = new Scanner(System.in);
        libro libro1 = new libro();
        libro libro2 = new libro();
        libro libro3 = new libro();
        
        libro1.setNombre("Sin aliento");
        libro2.setNombre("Mujer amante")
    
        System.out.println("Ingrese una cancion");
        libro4.setNombre(lc.nextLine());
    
        libro [] libros = new libro[3];
        libros [0] = libro1;
        libros [1] = libro2;
        libros [2] = libro3;
        
        for(int i=0;i<libros.length;i++){
            System.out.println(libros[i].getNombre());
        }
    } 
 }
*/
}
