public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        }
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        if (dni != null && dni != "") {
            this.dni = dni;
        }
    }

    public Celular getCelular() {
        return this.celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", celular=" + (celular != null ? celular.getMarca() : null) +
                '}';
    }
}
