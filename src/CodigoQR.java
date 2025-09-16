public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if (valor != null && valor != "") {
            this.valor = valor;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        if  (usuario != null) {
            this.usuario = usuario;
        }
    }

    @Override
    public String toString() {
        return "CodigoQR{" +
                "valor='" + valor + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
