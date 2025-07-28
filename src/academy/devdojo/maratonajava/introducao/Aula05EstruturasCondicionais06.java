package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    // dado 1 ao 7, imprima se é util ou final de semana, 1 = domingo
    public static void main(String[] args) {

        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("é final de semana");
                break;
            case 2:
                System.out.println("é dia util");
                break;
            case 3:
                System.out.println("é dia util");
                break;
            case 4:
                System.out.println("é dia util");
                break;
            case 5:
                System.out.println("é dia util");
                break;
            case 6:
                System.out.println("é dia util");
                break;
            case 7:
                System.out.println("é final de semana");
                break;
            default:
                System.out.println("entrada invalida");
                break;
        }
        dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("é final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("é dia util");
                break;
            default:
                System.out.println("entrada invalida");


        }
    }
}
