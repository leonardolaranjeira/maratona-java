package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Dado um determinado salário anual, qual o valor que se paga de impostos em euros:
        // 0 à 34,712: 9.70%
        // 34,713 à 68,507: 37.35%
        // 68,508: 49.50%

        double salario = 50000;
        double imposto;

        if (0 < salario && salario <= 34712){
             imposto = 0.097 * salario;
             System.out.println("Os impostos a serem pagos são de 9.70% sendo: R$" + imposto);
        } else if (34713 < salario && salario < 68507){
             imposto = 0.3735 * salario;
             System.out.println("Os impostos a serem pagos são de 37.35% sendo: R$" + imposto);
        } else{
             imposto = 0.4950 * salario;
             System.out.println("Os impostos a serem pagos são de 49.50% sendo: R$" + imposto);
        }
    }
}
