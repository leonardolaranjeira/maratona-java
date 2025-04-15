package academy.devdojo.maratonajava.javacore.Gexseminarios.test;

import academy.devdojo.maratonajava.javacore.Gexseminarios.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gexseminarios.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gexseminarios.dominio.Seminario;

public class SeminariosTest01 {
    public static void main(String[] args) {

        // Alunos
        Aluno jose = new Aluno("Jose", 16);
        Aluno julia = new Aluno("Julia", 17);
        Aluno pedro = new Aluno("Pedro", 17);

        //Professores
        Professor paulo = new Professor("Paulo Andrade", "Engenharia de dados");
        Professor ana = new Professor("Ana Paula", "Gestão de projetos");
        Professor rodrigo = new Professor("Rodrigo Guedes", "Engenharia de software");

        // Seminários
        Seminario tecnologia = new Seminario("Gestão de TI", "Tatuapé", new Aluno[]{jose, julia, pedro}, paulo);
        Seminario economia = new Seminario("Finanças", "Penha", new Aluno[]{jose}, ana);
        Seminario negociacao= new Seminario("Comercio exterior", "Liberdade", new Aluno[]{pedro}, ana);
        Seminario oracle = new Seminario("Nuvem", "Bresser", new Aluno[]{julia}, rodrigo);

        //Imprimindo informações
        tecnologia.imprime();
    }
}
