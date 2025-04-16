package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Larissa", 17);
        Aluno[] alunosParaSeminario = {aluno};

        Local local = new Local("Rua das laranjeiras, 402");
        Seminario seminario = new Seminario("O mundo do TI", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        Professor professor = new Professor("Gustavo Guanabara", "Engenharia de Software");

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
