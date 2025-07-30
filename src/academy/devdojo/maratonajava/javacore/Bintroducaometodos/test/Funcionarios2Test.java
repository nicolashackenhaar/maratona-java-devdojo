package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios2;

public class Funcionarios2Test {
    public static void main(String[] args) {
        Funcionarios2 funcionario = new Funcionarios2();

        funcionario.nome = "Nicolas Hackenhaar";
        funcionario.salarios = new double[]{2500, 3500, 4500};


        funcionario.impresora();


    }
}
