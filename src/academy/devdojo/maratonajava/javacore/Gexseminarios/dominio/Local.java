package academy.devdojo.maratonajava.javacore.Gexseminarios.dominio;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco, Seminario seminario) {
        this.endereco = endereco;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("Seminário: " + seminario);
        System.out.println("Local do evento: " + endereco);
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Seminario getSeminario() { return seminario; }
    public void setSeminario(Seminario seminario) { this.seminario = seminario;}
}
