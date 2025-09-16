public class Main {
    public static void main(String[] args) {
        GeneradorQR generadorQR = new GeneradorQR();
        Usuario usuario = new Usuario("Barnie", "barnie@gmail.com");
        generadorQR.generar("http://example.com", usuario);
    }
}
