package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //todos os pares de 0 a 1 000 000

//        long number = 0;
//        long resto = number % 2;
//        boolean isPair = false;
//
//        while (number < 1000001) {
//            resto = number % 2;
//            if (resto == 0) {
//                isPair = true;
//                System.out.println(number);
//            } else {
//                isPair = false;
//            }
//            number++;
//        }

//        long number = 0;
//
//        while (number<1000000){number +=2;
//            System.out.println(number);
//        }

//        for(int i = 0 ;i<= 1000000; i+=2){
//            System.out.println(i);
//        }
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
//            }else{
//                System.out.println("impar"+i);
            }
        }
    }

}
