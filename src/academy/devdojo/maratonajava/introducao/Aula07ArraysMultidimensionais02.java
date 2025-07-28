package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

//        for (int[] arrayBase : arrayInt) {
//            for (int num : arrayBase) {
//                System.out.print(num + " ");
//            }
//            System.out.println("\n ---");
//        }
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = j;
                System.out.print(arrayInt[i][j] + " ");

            }
            System.out.println("\n---");
        }


        /// /////////////////////////////
        /*
Este trecho do código abaixo realiza a ordenação de cada linha de uma matriz irregular (matriz com linhas de tamanhos diferentes)
usando o algoritmo de ordenação Bubble Sort.

Passo a passo do que está acontecendo:

1. Percorremos cada linha da matriz com o índice 'i'.
2. Para cada linha, executamos múltiplas "passagens" com o índice 'k'.
   Isso é necessário porque o Bubble Sort precisa de várias passagens para garantir que todos os elementos fiquem ordenados.
3. Dentro de cada passagem, comparamos pares de elementos vizinhos da linha, nos índices 'j' e 'j + 1'.
   - Se o elemento da esquerda (arrayInt[i][j]) for menor que o da direita (arrayInt[i][j + 1]),
     trocamos os dois de lugar.
   - Isso faz com que os maiores valores "borbulhem" para o final da linha a cada passagem.
4. A expressão 'arrayInt[i].length - 1 - k' garante que, a cada nova passagem,
   o laço interno percorra uma quantidade menor de elementos, já que os últimos já estão na posição correta.
5. Ao final, cada linha da matriz estará ordenada em ordem decrescente (do maior para o menor).

Esse algoritmo funciona corretamente mesmo em matrizes irregulares porque cada linha é tratada individualmente
com base no seu próprio tamanho.

Exemplo de entrada:
Linha 0: 1 2
Linha 1: 1 2 3
Linha 2: 1 2 3 4 5 6

Resultado após a ordenação:
Linha 0: 2 1
Linha 1: 3 2 1
Linha 2: 6 5 4 3 2 1
*/
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = j + 1;
                System.out.print(arrayInt[i][j]);
            }

            System.out.println("\n ---");

        }
        System.out.println("--------------------");

        for (int i = 0; i < arrayInt.length ; i++) {
            for (int k = 0; k < arrayInt[i].length - 1; k++) {
                for (int j = 0; j < arrayInt[i].length - 1 -k; j++) {
                    if (arrayInt[i][j] < arrayInt[i][j + 1]) {
                        int temp = arrayInt[i][j];
                        arrayInt[i][j] = arrayInt[i][j + 1];
                        arrayInt[i][j + 1] = temp;
                    }
                }
            }
        }
        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n ---");
        }

    }
}
