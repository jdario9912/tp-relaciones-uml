public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Flanders", "flanders@ned.com");
        Documento documento = new Documento("Titulo", "loremipsun2000", "*/234566342", "12-12-26", usuario);
        System.out.println(documento);
    }
}
