public class PlacaMadre {
    private String marca;
    private String numeroSerie;

    public PlacaMadre(String marca, String numeroSerie) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
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

    @Override
    public String toString() {
        return "PlacaMadre{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
