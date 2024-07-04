/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Autor;
import Modelo.Publicacion;

public class controladorAutor {

    public void agregarPublicacion(Publicacion publicacionNueva, Autor autor) {
        autor.agregarPublicacion(publicacionNueva);
    }

    public Autor crearAutor(String filiacion, String linealnvestigacion, String nacionalidad, String nombre) {
        return new Autor(filiacion, linealnvestigacion, nacionalidad, nombre, 10);
    }

    public Publicacion crearPublicacion(int año, String nombreRevista, String titulo) {
        return new Publicacion(año, nombreRevista, titulo);
    }

    public String imprimirAutor(Autor autor) {
        return autor.toString();
    }
}
