package academy.devdojo.maratonajava.introducao;

import java.util.concurrent.LinkedTransferQueue;

public class Aula05EstruturasDeRepeticao04 {
    //quantas vezes pode ser parcelado o carro
    //condição valorParcela >= 1000
    public static void main(String[] args) {
//
//        double valorCarro = 30000;
//        double parcelas = 1;
//        double valorParcela;
//
////        for ( parcelas = 1; parcelas <= valorCarro/1000; parcelas++) {
////         valorParcela = valorCarro / parcelas;
////            if (valorParcela >= 1000) {
////                System.out.println(parcelas+"x de R$ "+valorParcela);
////            }else{
////                break;
////            }
////        }
//        for ( parcelas = 1; parcelas <= valorCarro/1000; parcelas++) {
//            valorParcela = valorCarro / parcelas;
//            System.out.println(parcelas+"x de R$ "+valorParcela);
//            if (valorParcela < 1000) {
//                break;
//            }
//        }
////        System.out.println(parcelas);
////        System.out.println(valorParcela);


        //quantas vezes pode ser parcelado o carro
        //condição valorParcela >= 1000
        // com juros
        double valorCarro = 40000;
        int parcelas;
        double valorParcela;
        double juros = 0.02;

        for (parcelas = 1; parcelas <= valorCarro/1000 ; parcelas++) {

            valorParcela = (valorCarro/parcelas);


            if(valorParcela>= 1000){
                valorParcela = valorParcela +((valorParcela * juros)*parcelas);
                System.out.println(parcelas+"x de R$ "+valorParcela+" Total do valor do carro com juros é: R$"+valorParcela*parcelas);
            }else break;
        }
    }
}

