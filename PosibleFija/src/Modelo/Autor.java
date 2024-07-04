package Modelo;

public class Autor {
    private int cantidadPublicaciones;
    private String filiacion;
    private String linealnvestigacion;
    private String nacionalidad;
    private String nombre;
    private Publicacion[] publicaciones;

    public Autor(int tamañoArreglo) {
        this.cantidadPublicaciones = 0;
        this.publicaciones = new Publicacion[tamañoArreglo];
    }

    public Autor(String filiacion, String linealnvestigacion, String nacionalidad, String nombre, int tamañoArreglo) {
        this.filiacion = filiacion;
        this.linealnvestigacion = linealnvestigacion;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.cantidadPublicaciones = 0;
        this.publicaciones = new Publicacion[tamañoArreglo];
    }

    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    public String getFiliacion() {
        return filiacion;
    }

    public String getLinealnvestigacion() {
        return linealnvestigacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Publicacion[] getPublicaciones() {
        return publicaciones;
    }

    public void setCantidadPublicaciones() {
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    public void setFiliacion(String filiacion) {
        this.filiacion = filiacion;
    }

    public void setLinealnvestigacion(String linealnvestigacion) {
        this.linealnvestigacion = linealnvestigacion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPublicaciones(Publicacion[] publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void agregarPublicacion(Publicacion publicacionNueva) {
        if (cantidadPublicaciones < publicaciones.length) {
            publicaciones[cantidadPublicaciones] = publicacionNueva;
            cantidadPublicaciones++;
        } else {
            System.out.println("No hay espacio para más publicaciones");
        }
    }

    @Override
    public String toString() {
        return "Wa";
    }
}