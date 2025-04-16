package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.sql.SQLOutput;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        if (this.seminarios == null) return;
        System.out.println(">>> Seminários cadastrados <<<");
        for (Seminario seminario : this.seminarios) {
            System.out.println("Seminário: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println(" >> Alunos << ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " | idade: " + aluno.getIdade());
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public Seminario[] getSeminarios() { return seminarios; }
    public void setSeminarios(Seminario[] seminarios) { this.seminarios = seminarios; }
}

/* Crie um sistema que gerencia seminários
*
* O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
*
* Um aluno poderá estar em apenas um semnário
* Um seminário poderá ter nenhum ou vários alunos
* Um professor poderá ministrar vários seminários
* Um seminário deve ter um local
*
* Campos básicos (excluindo relacionamento)
* seminário: titulo
* aluno: nome e idade
* professor: nome e especialidade
* local: endereço */
