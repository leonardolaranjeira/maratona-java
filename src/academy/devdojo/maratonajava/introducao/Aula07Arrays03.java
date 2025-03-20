package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = new int[]{1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

/* Está é a maneira "padrão de se fazer um loop for
    for (int i = 0;i < numeros3.length; i++) {
        System.out.println(numeros3[i]);
} */

    /* Existe formas de se fazer um loop desses de forma mais "simples" e que seja mais compacta, como no exemplo abaixo:
    * Esta maneira é usada em arrays (Para cada valor no array o laço irá contar os dados através de ")*/

        /* Este tipo de sintaxe é usado para ser mais pratico e eficiente a repetição de impressão das informações de uma
         Array no console. */

        // Foreach: Boa prática usada em loops em Arrays na lógica de programação.
        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}
