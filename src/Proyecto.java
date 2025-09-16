public class Proyecto {
    private String nombre;
    private double duracionMin;

    public Proyecto(String nombre, double descripcion) {
        this.nombre = nombre;
        this.duracionMin = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        }
    }

    public double getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(double duracionMin) {
        if (duracionMin >= 0 && duracionMin <= 59) {
            this.duracionMin = duracionMin;
        }
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", duracionMin=" + duracionMin +
                '}';
    }
}
