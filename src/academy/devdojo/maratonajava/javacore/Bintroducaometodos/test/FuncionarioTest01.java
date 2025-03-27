package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Lee");
        funcionario.setIdade((short) 23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
    }
}

    /*{
        double somaSalarios = 0;
        Funcionario Luis = new Funcionario();
        Funcionario Pedro = new Funcionario();
        Funcionario Luana = new Funcionario();

        Luis.nome = "Luis";
        Luis.idade = 26;
        Luis.salario = 6500d;
        somaSalarios +=  Luis.salario;

        Pedro.nome = "Pedro";
        Pedro.idade = 22;
        Pedro.salario = 4200d;
        somaSalarios += Pedro.salario;

        Luana.nome = "Luana";
        Luana.idade = 23;
        Luana.salario = 7800d;
        somaSalarios += Luana.salario;

        double media = somaSalarios / 3;

        Luis.imprimir();
        Pedro.imprimir();
        Luana.imprimir();
        System.out.printf("Media dos salários: R$%.2f%n", media);
    }
}*/
