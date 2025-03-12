package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        // Se a ordem de prescedencia de uma String for "'<String>' + valor01(int) + valor02(int)", o resultado
        // será concatenação e não um valor somado, subtraido, dividido ou multiplicado por outro...

        // % - Resto
        int resto = 21 % 7;
        System.out.println(resto);
        // Resto = 1

        // < > <= >= == != - Operadores lógicos (retornam valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);

        // Operadores lógicos: && (AND), || (OR), ! (NOT)

        // &&: AND
        int idade = 29;
        float salario = 3500f;
        boolean isTrueOrFalse = idade >= 30 && salario >= 4612;

        // ||: OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlayCinco = 5000f;
        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlayCinco || valorTotalContaPoupanca > valorPlayCinco;
        System.out.println("isPlayCincoCompravel: " + isPlayCincoCompravel);

        // Operadores de atribuição: = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //bonus = bonus + 1000;
        bonus -= 1000; //bonus = bonus - 1000;
        bonus *= 2; //bonus = bonus * 2;
        bonus /= 2; //bonus = bonus / 2;
        bonus %= 2; //bonus = bonus % 2;
        System.out.println(bonus);

        // ++ --
        /*
        Se os operadores + ou - estiverem antes da variável, vai atribuir valor antes da execução da variável, se for
        acrescentado depois da variavel será acrescentado valor após a execução da variável.
         */
        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++; // Soma mais 1
        contador--; // Subtrai 1
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
