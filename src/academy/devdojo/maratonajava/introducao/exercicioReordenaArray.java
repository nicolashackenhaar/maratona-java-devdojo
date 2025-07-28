package academy.devdojo.maratonajava.introducao;

public class exercicioReordenaArray {
    public static void main(String[] args) {
        int array[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1,3,4,5,6};

        for (int num : array) {
            System.out.print(num);
        }
        System.out.println("\n -");

        for (int i = 0; i < array.length - 1; i++) {//-1 para não passar na ultima posição pois já esta ordenada
            for (int j = 0; j < array.length - 1 - i; j++) {//-1 para não tentar acessar uma posição que não existe, -i é para não comparar com quem já esta no ultimo
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j]= array[j +1];
                    array[j+1] = temp;
                }
            }
        }
        for (int num : array) {
            System.out.print(num);
        }


//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < (array.length -1); j++) {
//                if (array[i] > array[j]){
//                    array[i] = array[j];
//
//
//                }
//            }
//        }
    }
}
