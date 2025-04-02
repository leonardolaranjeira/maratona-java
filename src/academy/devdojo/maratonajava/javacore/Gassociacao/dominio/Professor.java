package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
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
