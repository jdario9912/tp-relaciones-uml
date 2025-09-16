public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Joel", "123456779");
        CuentaBancaria cuenta1 = new CuentaBancaria(500000, "1234566798", "123abc", "12-12-24");
        cuenta1.setTitular(titular);
        System.out.println(cuenta1);
    }
}
