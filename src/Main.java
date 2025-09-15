public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(4, 6);
        Cliente cliente = new Cliente("Joel", "123456789");
        Reserva reserva = new Reserva("20-10-2025", "20:00", mesa);
        reserva.setCliente(cliente);
        System.out.println(reserva);
    }
}
