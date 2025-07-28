package academy.devdojo.maratonajava.introducao;

public class Juroscompostos {
    public static void main(String[] args) {
        double aporteInicial = 1000;
        double aporteMensal = 1000;
        double juroAnual = 12;
        double tax = (juroAnual/12)/100;
        int prasoMeses = 60;

        double mes = aporteInicial;

        for (int i = 0; i <= prasoMeses; i++) {
            if ( i ==0){
                aporteInicial = aporteInicial+ (aporteInicial*tax);
                System.out.println("mes:" + i + " " + aporteInicial);
            }else {
                mes = mes + aporteMensal;
                double juros = (mes * tax);
                mes = mes + juros;


                System.out.println("mes:" + i + " " + mes+", recebendo "+juros);
            }
        }


    }
}
