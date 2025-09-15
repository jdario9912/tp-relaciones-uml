public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return this.pasaporte;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        }

    }

    public void setDni(String dni) {
        if (dni != null && dni != "") {
            this.dni = dni;
        }
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", pasaporte=" + (pasaporte != null ? pasaporte.getNumero() : null) +
                '}';
    }
}
