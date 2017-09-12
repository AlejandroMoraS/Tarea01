package mx.iteso.is705419.tarea01;

/**
 * Created by Alex Mora on 05/09/2017.
 */

public class Alumno {
    private String nombre;
    private String telefono;
    private String escolaridad;
    private String genero;
    private String libro_favorito;

    public Alumno(String nombre, String telefono,
                  String escolaridad, String genero, String libro_favorito,
                  boolean deporte) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.escolaridad = escolaridad;
        this.genero = genero;
        this.libro_favorito = libro_favorito;
        this.deporte = deporte;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLibro_favorito(String libro_favorito) {
        this.libro_favorito = libro_favorito;
    }

    public void setDeporte(boolean deporte) {
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public String getGenero() {
        return genero;
    }

    public String getLibro_favorito() {
        return libro_favorito;
    }

    public boolean isDeporte() {
        return deporte;
    }

    private boolean deporte;

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", escolaridad='" + escolaridad + '\'' +
                ", genero='" + genero + '\'' +
                ", libro_favorito='" + libro_favorito + '\'' +
                ", deporte=" + deporte +
                '}';
    }
}
