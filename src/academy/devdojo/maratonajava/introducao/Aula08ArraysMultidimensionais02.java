package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // Maneiras de se inicializar arrays

        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");

            }
        }
    }
}
