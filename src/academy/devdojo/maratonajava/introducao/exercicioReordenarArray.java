package academy.devdojo.maratonajava.introducao;

public class exercicioReordenarArray {
    public static void main(String[] args) {

        // imprime array antes
        //pula linha
        // reordena array

        int array[] = new int[]{37, 82, 14, 59, 6, 93, 25, 71, 48};
        for (int num : array) {
//            num += 1 ;
            System.out.print(num+" ");
        }
        System.out.println("\n -");
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        for (int num : array) {
            System.out.print(num+" ");
        }
    }
}

