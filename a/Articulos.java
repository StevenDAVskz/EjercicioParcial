
public class Articulos {
    protected String Nombre;
    protected String Descripcion;
    protected String estado;
    protected int PrecioInicial;
    protected int PrecioFinal;

    public Articulos() {

    }

    public Articulos(String nombre, String descripcion, String estado, int precioInicial, int precioFinal) {
        Nombre = nombre;
        Descripcion = descripcion;
        this.estado = estado;
        PrecioInicial = precioInicial;
        PrecioFinal = precioFinal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecioInicial() {
        return PrecioInicial;
    }

    public void setPrecioInicial(int precioInicial) {
        PrecioInicial = precioInicial;
    }

    public int getPrecioFinal() {
        return PrecioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        PrecioFinal = precioFinal;
    }

}
