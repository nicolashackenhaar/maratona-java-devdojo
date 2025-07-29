package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro2;

public class Carro2Test {
    public static void main(String[] args) {
        Carro2 carro1 = new Carro2();
        Carro2 carro2 = new Carro2();

        carro1.nome = "bmw";
        carro1.modelo = "320i";
        carro1.ano = 2012;

        carro2.nome = "mercedes";
        carro2.modelo = "c180";
        carro2.ano = 2014;

        System.out.println(carro1.nome+ " "+carro1.modelo+" "+carro1.ano);
        System.out.println(carro2.nome+ " "+carro2.modelo+" "+carro2.ano);

    }
}
