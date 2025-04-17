package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua 3");
        endereco.setCep("01234-209");
        Pessoa pessoa = new Pessoa("Eloy Ferreira");
        pessoa.setCpf("44455599902");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("José Moreira");
        funcionario.setCpf("22233344455");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("------------------------------");
        funcionario.imprime();
    }
}
