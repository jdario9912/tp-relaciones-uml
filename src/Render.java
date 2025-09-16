public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if (formato != null && formato != "") {
            this.formato = formato;
        }
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            this.proyecto = proyecto;
        }
    }

    @Override
    public String toString() {
        return "Render{" +
                "formato='" + formato + '\'' +
                ", proyecto=" + proyecto +
                '}';
    }
}
