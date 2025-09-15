public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Joel", "123456789");
        Pasaporte pasaporte = new Pasaporte("1235", "12-1-22", "jpg", "alguna-imagen");
        System.out.println(pasaporte);
        pasaporte.setTitular(titular);
        System.out.println(pasaporte);
        System.out.println(titular.getPasaporte());
    }
}
