package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Camaro";
        carro1.modelo = "GM";
        carro1.ano = 2011;

        carro2.nome = "320i";
        carro2.modelo = "BMW";
        carro2.ano = 2012;

        System.out.println(carro1.modelo+" "+carro1.nome+", "+carro1.ano);
        System.out.println(carro2.modelo+" "+carro2.nome+", "+carro2.ano);
    }
}
