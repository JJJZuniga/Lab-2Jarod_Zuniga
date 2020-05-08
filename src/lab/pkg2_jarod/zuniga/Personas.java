
package lab.pkg2_jarod.zuniga;


public class Personas {
    private String nombre;
    private String usuario;
    private String contraseña;

    public Personas() {
    }

    public Personas(String nombre, String usuario, String contraseña) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", usuario=" + usuario + ", contrase\u00f1a=" ;
    }
    
    
}
