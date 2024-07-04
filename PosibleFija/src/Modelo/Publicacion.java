
package Modelo;

public class Publicacion {
    
    private int ano;
    private String nombreRevista;
    private String titulo;

    public Publicacion(int ano, String nombreRevista, String titulo) {
        this.ano = ano;
        this.nombreRevista = nombreRevista;
        this.titulo = titulo;
    }
    
    @Override
    public String toString() {
        return nombreRevista + " - " + titulo; 
    }
}
