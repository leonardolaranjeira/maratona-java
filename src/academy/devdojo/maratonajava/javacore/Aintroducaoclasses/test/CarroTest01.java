package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Sandeiro";
        carro1.modelo = "Expression";
        carro1.ano = 2014;

        carro2.nome = "Fusca";
        carro2.modelo = "Sedan";
        carro2.ano = 1996;

        System.out.println("Carro1: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Carro2: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

/*
Classe: É o que temos na programação para representar algo no mundo real como uma instância (Objeto). É o agrupamento de
coisas do mundo real que darão origem ao objeto.

Aula 39 - Maratona Java - Devdojo
Programação orientada a objeto: A função da orientação ao objeto é mapear o mundo real para o mundo computacional.
 */

    }
}
