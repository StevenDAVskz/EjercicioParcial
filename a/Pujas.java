public class Pujas {
    protected int PrecioMayor;
    protected String Registro;
    protected int IdPostor;
    protected int PrecioVenta;
    protected String fechaLimite;
    protected int PrecioFinalMayor;
    protected String UsuarioGanador;

    public Pujas() {

    }

    public Pujas(int precioMayor, String registro, int idPostor, int precioVenta, String fechaLimite,
            int precioFinalMayor, String usuarioGanador) {
        PrecioMayor = precioMayor;
        Registro = registro;
        IdPostor = idPostor;
        PrecioVenta = precioVenta;
        this.fechaLimite = fechaLimite;
        PrecioFinalMayor = precioFinalMayor;
        UsuarioGanador = usuarioGanador;
    }

    public int getPrecioMayor() {
        return PrecioMayor;
    }

    public void setPrecioMayor(int precioMayor) {
        PrecioMayor = precioMayor;
    }

    public String getRegistro() {
        return Registro;
    }

    public void setRegistro(String registro) {
        Registro = registro;
    }

    public int getIdPostor() {
        return IdPostor;
    }

    public void setIdPostor(int idPostor) {
        IdPostor = idPostor;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        PrecioVenta = precioVenta;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getPrecioFinalMayor() {
        return PrecioFinalMayor;
    }

    public void setPrecioFinalMayor(int precioFinalMayor) {
        PrecioFinalMayor = precioFinalMayor;
    }

    public String getUsuarioGanador() {
        return UsuarioGanador;
    }

    public void setUsuarioGanador(String usuarioGanador) {
        UsuarioGanador = usuarioGanador;
    }

}
