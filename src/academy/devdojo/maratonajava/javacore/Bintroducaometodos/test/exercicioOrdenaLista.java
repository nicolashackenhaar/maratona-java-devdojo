package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

public class exercicioOrdenaLista {
    public static void main(String[] args) {
        // coloca 84323 -> [2,3,3,4,8]
        //primeiro transforma o numero em lista, depois ordena maior para menor

        int num = 84323;
        String numStr = String.valueOf(num);
        int[] lista = new int[numStr.length()];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = Character.getNumericValue(numStr.charAt(i));
//            System.out.print(lista[i]);

        }
//        System.out.println("\n"+lista[0]+lista[1]+lista[2]+lista[3]+lista[4]);

        for (int i = 0; i < lista.length -1; i++) {
            for (int j = 0; j < lista.length -1 -i; j++) {
                if (lista[j] > lista[j+1] ){
                    for (int valor: lista){
                        System.out.print(valor);
                    }System.out.println(" - ");
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;

                    for (int valor: lista){
                        System.out.print(valor);

                    }System.out.println("\n - ");

                }

            }

        } for (int valor: lista){
            System.out.print(valor);

        }




//        for (int i = 0; i <num.; i++) {
//
//        }

    }
}
