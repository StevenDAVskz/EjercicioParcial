public class Usuario {
    protected String Nombre;
    protected String Apellido;
    protected String Direccion;
    protected int ID;
    protected String Email;

    public Usuario() {

    }

    public Usuario(String nombre, String apellido, String direccion, int iD, String email) {
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        ID = iD;
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
