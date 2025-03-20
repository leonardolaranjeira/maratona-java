package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
        Resultados padrões de tipos primitivos em Arrays
        byte, short, int, long, float e double: 0
        char: 'u0000' ' '
        boolean: false
        String: null
         */

        String[] nomes = new String[4];
        nomes[0] = "Leandro";
        nomes[1] = "Pedro";
        nomes[2] = "Sandro";
        nomes[3] = "Gustavo";

        for (int i = 0;i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
    }
}
