public class Bateria {
    private String modelo;
    private String capacidad;

    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && modelo != "") {
            this.modelo = modelo;
        }
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        if (capacidad != null && capacidad != "") {
            this.capacidad = capacidad;
        }
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "modelo='" + modelo + '\'' +
                ", capacidad='" + capacidad + '\'' +
                '}';
    }
}
