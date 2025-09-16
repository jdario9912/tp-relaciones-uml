public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Pelicula", 40);
        EditorVideo editor = new EditorVideo();
        editor.exportar("mp4", proyecto);
    }
}
