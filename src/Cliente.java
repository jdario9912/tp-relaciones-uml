public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaCredito;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni != null && dni != "") {
            this.dni = dni;
        }
    }

    public TarjetaDeCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaDeCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
        if (tarjetaCredito != null && tarjetaCredito.getCliente() != this) {
            tarjetaCredito.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tarjetaCredito=" + (tarjetaCredito != null ? tarjetaCredito.getBanco() : null) +
                '}';
    }
}
