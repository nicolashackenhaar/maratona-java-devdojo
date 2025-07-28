package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

public class ExercicioJavaAteAula53Gpt {
    public static void main(String[] args) {
        int[] votos = {1, 3, 2, 5, 3, 2, 2, 4, 1, 7, 3, 2, 6};
        int votosP1 = 0;
        int votosP2 = 0;
        int votosP3 = 0;
        int votosP4 = 0;
        int votosP5 = 0;
        int invalidos = 0;

        for (int i = 0; i < votos.length; i++) {
            if (votos[i] == 1) {
                votosP1 += 1;
            } else if (votos[i] == 2) {
                votosP2++;
            } else if (votos[i] == 3) {
                votosP3++;
            } else if (votos[i] == 4) {
                votosP4++;
            } else if (votos[i] == 5) {
                votosP5++;
            } else {
                invalidos++;
            }
        }
        System.out.println("Personagem 1 teve: " + votosP1 + " votos");
        System.out.println("Personagem 2 teve: " + votosP2 + " votos");
        System.out.println("Personagem 3 teve: " + votosP3 + " votos");
        System.out.println("Personagem 4 teve: " + votosP4 + " votos");
        System.out.println("Personagem 5 teve: " + votosP5 + " votos");
        System.out.println("Votos inválidos: " + invalidos);
        int[] contagem = {votosP1, votosP2, votosP3, votosP4, votosP5};
        int maiorVoto = 1;
        int maisVotado = 0;
        for (int i = 0; i < contagem.length; i++) {

            if (contagem[i] > maiorVoto) {
                maiorVoto = contagem[i];
                maisVotado = i;
            }
        }
        System.out.println("O personagem mais votado é: " + (maisVotado + 1));

    }
}
