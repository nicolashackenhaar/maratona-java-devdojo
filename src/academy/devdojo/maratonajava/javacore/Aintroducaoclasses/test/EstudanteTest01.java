package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Bob Esponja";
        estudante.idade = 18;
        estudante.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Patrik Estrela";
        estudante2.idade = 18;
        estudante2.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
