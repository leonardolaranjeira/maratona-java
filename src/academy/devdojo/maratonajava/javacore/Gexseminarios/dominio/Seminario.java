package academy.devdojo.maratonajava.javacore.Gexseminarios.dominio;

public class Seminario {
    private String titulo;
    private String local;
    private Aluno[] alunos;
    private Professor professor;

    // Construtor
    public Seminario(String titulo, String local, Aluno[] alunos, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
        this.professor = professor;
    }

    // Método de impressão
    public void imprime() {
        System.out.println("Título: " + titulo);
        System.out.println("Local: " + local);
        System.out.println("Alunos inscritos:");
        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.print(aluno.getNome() + " ");
        }
        System.out.println("\nCom o professor: " + professor.getNome() + ", especialista em " + professor.getEspecialidade());
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    // métodos de associação
    public Aluno[] getAlunos() { return alunos; }
    public void setAlunos(Aluno[] alunos) { this.alunos = alunos; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }
}
