package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28,31,30 Dias
        /* Basicamente um "sistema" de listas dentro de listas e para acessá-las basta usar "coordenadas" */

        int[][] dias = new int[3][3];
        // Arrays multidimensionais
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-------------------------");
        System.out.println("Arrays multidimensionais com 'Foreach'");

        // Foreach com Arrays multidimensionais
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
