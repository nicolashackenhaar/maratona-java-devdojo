package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 5;
        // PARA O SWITCH : char int byte short enum string
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("Entrada invalida");
        }
        String sex = "F";
        switch (sex) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            case "N":
                System.out.println("Não binario");
                break;
            default:
                System.out.println("entrada inválida");
                break;
        }

    }
}
