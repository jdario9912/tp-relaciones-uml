public class CuentaBancaria {
    //    cbu saldo
    private int saldo;
    private String cbu;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(int saldo, String cbu, String codigo, String ultimaModificacion) {
        this.saldo = saldo;
        this.cbu = cbu;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
        }
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        if (cbu != null && cbu != "") {
            this.cbu = cbu;
        }
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        if (claveSeguridad != null) {
            this.claveSeguridad = claveSeguridad;

        }
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            this.titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", cbu='" + cbu + '\'' +
                ", claveSeguridad=" + claveSeguridad +
                ", titular=" + (titular != null ? titular.getNombre() : null) +
                '}';
    }
}
