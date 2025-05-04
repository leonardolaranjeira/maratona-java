package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // Algumas formas de se obter o mesmo resultado para esse tipo de cast (narrowing casting)

        /* if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Validade: " + tomate.getDataValidade()); */

        /* if(produto instanceof Tomate) {
            System.out.println("Validade: " + ((Tomate) produto).getDataValidade()); */

        if(produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Validade: " + dataValidade);
        }
    }
}
