package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //valores padrão: byte short int long float e double = 0
        //char '/u0000' ' '
        //boolean false
        // string null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Kuririn";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }

}
