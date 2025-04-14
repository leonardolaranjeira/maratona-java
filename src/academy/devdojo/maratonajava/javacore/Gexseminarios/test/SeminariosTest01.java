package academy.devdojo.maratonajava.javacore.Gexseminarios.test;

import academy.devdojo.maratonajava.javacore.Gexseminarios.dominio.Seminario;

public class SeminariosTest01 {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("God of war: Ragnarok", "Grécia antiga");

        System.out.println(seminario.getTitulo());
        System.out.println(seminario.getLocal());
    }
}
