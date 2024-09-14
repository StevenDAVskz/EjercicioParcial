public class Postor extends Usuario {
    protected Pujas Puja;
    protected int dineroPujado;
    protected String objetoGanado;

    public Postor() {

    }

    public Postor(String nombre, String apellido, String direccion, int iD, String email, Pujas puja, int dineroPujado,
            String objetoGanado) {
        super(nombre, apellido, direccion, iD, email);
        Puja = puja;
        this.dineroPujado = dineroPujado;
        this.objetoGanado = objetoGanado;
    }

    public Pujas getPuja() {
        return Puja;
    }

    public void setPuja(Pujas puja) {
        Puja = puja;
    }

    public int getDineroPujado() {
        return dineroPujado;
    }

    public void setDineroPujado(int dineroPujado) {
        this.dineroPujado = dineroPujado;
    }

    public String getObjetoGanado() {
        return objetoGanado;
    }

    public void setObjetoGanado(String objetoGanado) {
        this.objetoGanado = objetoGanado;
    }

}
