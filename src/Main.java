public class Main {
    public static void main(String[] args) {
        Computadora pc = new Computadora("PH", "1234-3456-3245", "Intel", "1234567890");
        Propietario persona = new Propietario("Joel", "34596732");
        pc.setPropietario(persona);
        System.out.println(pc);
    }
}
