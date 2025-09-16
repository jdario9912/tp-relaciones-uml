public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        if (monto > 0) {
            this.monto += monto;
        }
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        if (contribuyente != null) {
            this.contribuyente = contribuyente;
        }
    }

    @Override
    public String toString() {
        return "Impuesto{" +
                "monto=" + monto +
                ", contribuyente=" + contribuyente +
                '}';
    }
}
