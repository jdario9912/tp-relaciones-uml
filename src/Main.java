public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Foo Fighters", "Hardrock");
        Cancion cancion = new Cancion("The Pretender");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
