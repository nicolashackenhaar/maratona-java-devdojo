package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        int idade = 15;
        String categoria;

        if (idade < 15) {
            categoria= "infantil";
        }else if(idade >=15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
