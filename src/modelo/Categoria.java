package modelo;

import java.security.AuthProvider;
import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author FERNANDO
 */
public class Categoria {

    private int idCategoria;
    private String descripcion;
    private int estado;

    public Categoria() {

        this.idCategoria = 0;
        this.descripcion = "";
        this.estado = 0;

    }
     // el constrcutor lo utilizo para inicializar el objeto y estbalcer sus propiedades y sus valores predeterminados.
    public Categoria(int idCategoria, String descripcion, int estado) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
