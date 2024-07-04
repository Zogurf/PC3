
package practicanding.poo;

public class Alumno {
    
    private int id;
    public String nombre;
    private String apellido;
    
    // vacio (no recibe parametros, sirve para un objeto
    //que se utilizara mas adelante)
    public Alumno() {
    }
    
    // el parentesis es el parametro que recibe (datos que quiero completar)
    // el tihs es para referenciar que un objeto se hace a si mismo
    public Alumno(int id, String nombre, String apellido) {
        // solo se sustuye los this de esta  clase con los parametros
        // solo se usa en el constructor
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    // Los getter y setter van despues de los constructores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     
    // void es para procedimiento (no retorna ningun valor)
    public void monstrarNombre() {
        
            System.out.println("Hola, soy: ");
    }  
}
