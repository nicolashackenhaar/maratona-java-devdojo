package academy.devdojo.maratonajava.introducao;

public class ExercicioReordenaArrayBubbleSort {
    public static void main(String[] args) {
        int array[] = new int[]{37, 82, 14, 59, 6, 93, 25, 71, 48};

        for (int num : array) {
            System.out.print(num + ", ");
        }

        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i-1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("  ");
        for (int num: array){
            System.out.print(num+ ", ");
        }

    }
}
