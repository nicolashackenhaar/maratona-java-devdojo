package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //quanto tenho que pagar de imposto
    public static void main(String[] args) {
        double salario = 100000;
        double taxOne = 9.70 / 100;
        double taxTwo = 37.35 / 100;
        double taxThree = 49.5 / 100;
        double imposto;
        if (salario < 34713){
        imposto = salario * taxOne;
        } else if (salario >=34713 && salario < 68508) {
        imposto = salario * taxTwo;
        }else {
        imposto = salario * taxThree;
        }


        System.out.println("Se seu salário é: $"+salario+", seu imposto é de: $"+imposto );
        System.out.println(imposto);
    }
}
