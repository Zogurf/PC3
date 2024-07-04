
package Vista;
import Controlador.controladorAutor;
import Modelo.Autor;

import Modelo.Publicacion;

public class vistaAutor {
    public void main(String[] args) {
        Autor autor = controladorAutor.crearAutor("Filiación del autor", "Línea de investigación", "Nacionalidad", "Nombre del autor");
        Publicacion publicacion1 = controladorAutor.crearPublicacion(2023, "Revista A", "Título de la publicación 1");
        controladorAutor.agregarPublicacion(publicacion1, autor);
        System.out.println(controladorAutor.imprimirAutor(autor));
    }
    private controladorAutor controladorAutor;

    public vistaAutor() {
        controladorAutor = new controladorAutor();
    }
}
