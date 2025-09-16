public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Mongomeri Burns", "20-45678432-2");
        Impuesto impuesto = new Impuesto(13.3);
        impuesto.setContribuyente(contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
