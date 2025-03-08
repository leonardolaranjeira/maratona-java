package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos Primitivos
        // int, double, float, char, byte, short, long, boolean
        int age = 10;

        // Casting: Fazer com que a JVM aceite valores que estejam fora dos limites do tipo primitivo atribuido a variável.
        double n = 9.75;
        byte nota = (byte) n;

        int number = 1000;
        long numeroGrande = 100000;
        double salarioDouble = 2000.d; // or just: 2000
        float salarioFloat = 2500.0f; // or just: 2500
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;

        // Funcional de acordo com a "Tabela ASCII"
        char caractere = 87;

        System.out.println("A idade é: " + age + " anos.");
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println("Casting: " + nota);
    }
}
