package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao03 {
    public static void main(String[] args) {
//        //imprima os primeiros 25 numeros de um dado valor ex: 50
//        int valorMax = 50;
//
//        for (int i = 0; i <= valorMax; i++) {
//            if (i > 25) {
//                break;
//            }
////            if (i > 25) break;
//            System.out.println(i);
//        }
//    }
//}


//imprima os primeiros 25 numeros de um dado valor ex: 50
        int num = 99;
        int numPara = 12;
        for (int i = 1; i <num; i++) {
        if (i<=numPara && i%2 ==1 ){
            System.out.println(i);
        }
        }


    }
}