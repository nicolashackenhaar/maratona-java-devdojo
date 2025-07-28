package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;

        if (idade>=18){
            System.out.println("pode comprar cachaca");
        }else {
            System.out.println("Não pode");
        }
        idade++;
        if (idade>=18){
            System.out.println("Agora pode comprar cachaca");
        }else {
            System.out.println("ainda Não pode");
        }
        idade--;
        if (idade>=18){
            System.out.println("pode comprar cachaca");
        }else {
            System.out.println("agora Não pode novamente");
        }

    System.out.println("ou fazer assim");

        int anos = 18;
        boolean IsmaiorDeAnos = anos >= 18;
        if(IsmaiorDeAnos){
            System.out.println("é maior");
        }else{
            System.out.println("é menor");
        }

    }
}
