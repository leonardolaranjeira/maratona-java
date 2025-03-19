package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while e for
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }
        count = 0;
        do{ //do-while é usado igual while praticamente, porém a diferença é que mesmo que sua condição seja falsa ele
            // executará o comando pelo menos 1 vez.
            System.out.println("Dentro do do-while" + ++count);
        } while (count < 10);

        for (int i = 0; i < 10 ; i++){
            System.out.println("For " + i);
        }
    }
}
