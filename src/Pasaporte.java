public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", foto=" + foto +
                ", titular=" + titular +
                '}';
    }

    public Pasaporte(String numero, String fechaEmision, String formato, String imagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public Titular getTitular() {
        return this.titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }
}
