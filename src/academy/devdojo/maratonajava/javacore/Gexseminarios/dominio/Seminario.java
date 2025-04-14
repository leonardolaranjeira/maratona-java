package academy.devdojo.maratonajava.javacore.Gexseminarios.dominio;

public class Seminario {
    private String titulo;
    private String local;

    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLocal() {
        return local;
    }
}
