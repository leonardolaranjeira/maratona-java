package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);

        System.out.println("Código finalizado");
    }

    /**
     * @param a
     * @param b Não pode ser zero
     * @return
     * @throws IllegalArgumentException Caso b seja zero.
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento illegal: Não pode ser zero.");
        }
        return a / b;
    }
}
