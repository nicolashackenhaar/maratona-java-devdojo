package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            System.out.println("coloque o salario");
            return;
        }
        for (double s : salarios) {
            System.out.println("Salário " + s);
        }
        calculaMedia();

    }

    public void calculaMedia() {
        if (salarios == null) {
            System.out.println("coloque o salario");
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("A media salarial é : " + media);
    }

    public double getMedia() {
        return media;
    }

//    public void setMedia(double media) {
//        this.media = media;
//    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //    public void setNome(String nome) {
//        this.nome = nome;
//    }
//    public void setIdade(int idade){
//        this.idade = idade;
//    }
//
//    public void setSalarios(double[] salarios) {
//        this.salarios = salarios;
//    }
//
//    public void setMedia(double media) {
//        this.media = media;
//    }
//
//    public String getNome() {
//        return this.nome;
//    }
//
//    public int getIdade() {
//        return this.idade;
//    }
//
//    public double[] getSalarios() {
//        return this.salarios;
//    }
//
//    public double getMedia() {
//        return this.media;
//    }
}



