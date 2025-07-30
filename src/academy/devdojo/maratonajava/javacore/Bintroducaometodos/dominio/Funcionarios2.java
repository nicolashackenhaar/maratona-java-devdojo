package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios2 {
    public String nome;
    public double[] salarios;
    public double media;


    public void impresora() {
        System.out.println(this.nome);
        System.out.print("Salários: ");
        imprimeSalarios();
        media();


    }

    public void imprimeSalarios() {
        for (double salario : salarios) {
            System.out.print(salario + ", ");
        }
    }

    public void media() {
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];

        }
        double result = (soma / salarios.length);
        System.out.println("\n media salarial é: " + result);
    }


}
