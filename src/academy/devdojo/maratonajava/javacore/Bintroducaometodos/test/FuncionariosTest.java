package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionarios funcionario01 = new Funcionarios();
        Funcionarios funcionario02 = new Funcionarios();

        funcionario01.setNome("nicolas");
        funcionario01.setIdade(27);
        funcionario01.setSalarios(new double[]{6000, 7000, 8000});

        funcionario02.setNome("hackenhaar");
        funcionario02.setIdade(28);
        funcionario02.setSalarios(new double[]{60001, 70000, 80000});

        funcionario01.imprime();
        funcionario02.imprime();


        System.out.println(funcionario01.getMedia());

    }
}
