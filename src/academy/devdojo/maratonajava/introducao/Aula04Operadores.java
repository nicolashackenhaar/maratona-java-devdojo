package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 - numero02;
        System.out.println(resultado);

        int resto = 5 % 2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        // && (and), || (or), ! (not)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 000;
        double valorTotalContaPoupanca = 5000;
        float valorPlaystationCinco = 5000;
        double valorTotalTodasContas = valorTotalContaCorrente + valorTotalContaPoupanca;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystationCinco || valorTotalContaPoupanca >= valorPlaystationCinco || valorTotalTodasContas >= valorPlaystationCinco;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        int contador = 0;
        contador++;
        contador++;
        System.out.println(contador);
    }
}

