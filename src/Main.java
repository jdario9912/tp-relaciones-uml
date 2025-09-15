public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Musculo", "14");
        Celular celular = new Celular("1123-4asga", "Nokia", "A20", bateria);
        Usuario usuario = new Usuario("Joel", "23456791");
        celular.setUsuario(usuario);
        System.out.println(celular);
        System.out.println(usuario);
    }
}
