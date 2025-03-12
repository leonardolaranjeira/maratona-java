package academy.devdojo.maratonajava.introducao;
        /*
        Prática

        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
         */
        public class Aula03TiposPrimitivosExercicio {
            public static void main(String[] args) {

                String nome = "Leonardo";
                String endereco = "Aldeia da folha";
                double salario = 2000.0;
                String data = "05/03/2025";
                String relatorio = "Eu " + nome + ", morando no endereço " + endereco +
                        ", confirmo que recebi o salário de " + salario + ", na data " + data;

                System.out.println(relatorio);
    }
}
