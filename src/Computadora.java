public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    public Computadora(String marca, String numeroSerie, String marcaPlacaMadre, String numeroSeriePlacaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(marcaPlacaMadre, numeroSeriePlacaMadre);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && marca != "") {
            this.marca = marca;
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if (numeroSerie != null && numeroSerie != "") {
            this.numeroSerie = numeroSerie;
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            this.propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", propietario=" + (propietario != null ? propietario.getNombre() : null) +
                ", placaMadre=" + placaMadre +
                '}';
    }
}
