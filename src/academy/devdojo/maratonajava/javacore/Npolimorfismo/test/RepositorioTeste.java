package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Glenn");
        list.add("Chrono");
        list.add("Marle");
        System.out.println(list);

    }
}
