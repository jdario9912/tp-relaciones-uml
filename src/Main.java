public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Barth Simposon", "12345678");
        Banco banco = new Banco("Camro", "34-54376587-2");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("123456789", "12/03/26", banco);
        tarjeta.setCliente(cliente);
        System.out.println(tarjeta);
    }
}
