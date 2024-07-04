/*
Crear en Java la clase Alumno con los siguientes atributos privados:
foto, nombre (String)
edad, pc1, pc2, pc3, ef (int)
Crear los correspondientes getters y setters.
Implementar un constructor parametrizado completo.
Crear en Java la clase PruebaAlumno. Crear un objeto de tipo Alumno y poner a prueba la
implementación realizada.
 */
package Modelo;

public class Alumno {
    
    private String foto;
    private String nombre;
    private int edad;
    private int pc1;
    private int pc2;
    private int pc3;
    private int ef;
    
    public Alumno(String foto, String nombre, int edad, int pc1, int pc2, int pc3, int ef) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ef = ef;
    }

    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String noombre) {
        this.nombre = noombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPc1() {
        return pc1;
    }
    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }
    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }
    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getEf() {
        return ef;
    }
    public void setEf(int ef) {
        this.ef = ef;
    }
}
