public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "123456789");
        Conductor conductor = new Conductor("Homero Simpson", "B2");
        Vehiculo vehiculo = new Vehiculo("adb-1234-ad", "Rapido", motor);
        vehiculo.setConductor(conductor);
        System.out.println(vehiculo);
    }
}
