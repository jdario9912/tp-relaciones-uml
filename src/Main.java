public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Joel", "Argentino");
        Editorial editorial = new Editorial("Flanders", "Av Homero Simpson");
        Libro libro = new Libro("Maquina del tiempo", "123/nase", editorial);
        libro.setAutor(autor);
        System.out.println(libro);
    }
}
