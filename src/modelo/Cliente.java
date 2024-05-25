package modelo;

/**
 *
 * @author FERNANDO
 */
public class Cliente {

    //atributos de la clase cliente
    private int idCliente;
    private String nombre;
    private String apellido;
    private String dpi;
    private String telefono;
    private String direccion;
    private int estado;

    //mi constructor
    public Cliente() {
        this.idCliente = 0;
        this.nombre = "";
        this.apellido = "";
        this.dpi = "";
        this.telefono = "";
        this.direccion = "";
        this.estado = 0;
    }

//contructor sobrecargado
    public Cliente(int idCliente, String nombre, String apellido, String dpi, String telefono, String descripcion, int estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.telefono = telefono;
        this.direccion = descripcion;
        this.estado = estado;
    }
    //metodo set y get

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String descripcion) {
        this.direccion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
