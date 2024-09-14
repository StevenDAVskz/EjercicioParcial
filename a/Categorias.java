public class Categorias extends Articulos {
    protected String tipo;
    protected String descripcion;

    public Categorias() {

    }

    public Categorias(String nombre, String descripcion, String estado, int precioInicial, int precioFinal, String tipo,
            String descripcion2) {
        super(nombre, descripcion, estado, precioInicial, precioFinal);
        this.tipo = tipo;
        descripcion = descripcion2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
