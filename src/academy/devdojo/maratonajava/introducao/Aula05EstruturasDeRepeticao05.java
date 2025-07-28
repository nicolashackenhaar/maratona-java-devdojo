package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        double tax = 0;
        double tax12 = 0.01;
        double tax24 = 0.015;
        double tax36 = 0.02;

        for (int parcelas = (int) valorCarro; parcelas >= 1; parcelas--) {

            if (parcelas == 1) {
                tax = 0.0;
            } else if (parcelas >= 2 && parcelas <= 12) {
                tax = tax12;
            } else if (parcelas > 12 && parcelas <= 24) {
                tax = tax24;
            } else if (parcelas > 25) {
                tax = tax36;
            }

            double valorParcela = valorCarro / parcelas;
            valorParcela = valorParcela + ((valorParcela * tax)*parcelas);

            if (valorParcela > 1000) {
                System.out.println(parcelas + "x de R$ " + valorParcela + " o valor total com juros é: " + valorParcela * parcelas);
                System.out.println("A taxa é: " + tax + ", o total de juros é: " + ((valorParcela * parcelas) - valorCarro));
                System.out.println("---");
            }



        }
    }
}

