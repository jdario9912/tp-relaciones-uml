public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        if (imei != null && imei != ""){
            this.imei = imei;
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca != null && marca != ""){
            this.marca = marca;
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && modelo != ""){
            this.modelo = modelo;
        }
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this){
            this.usuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular{" +
                "imei='" + imei + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", usuario=" + (usuario != null ? usuario.getNombre() : null) +
                ", bateria=" + (bateria != null ? bateria : null) +
                '}';
    }
}
