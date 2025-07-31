package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios2 {
    public String nome;
    public int idade;
    public double[] salarios;

    public void impresora() {
        System.out.println(this.nome);
        System.out.println("idade " + this.idade);
        if (salarios == null) {
            System.out.println("Insira os ultimos 3 salarios.");
            return;
        }
        imprimeSalarios();
        imprimeMedia();
    }

    public void imprimeSalarios() {
        System.out.print("Salários: ");
        for (double salario : salarios) {
            System.out.print(salario + ", ");
        }
    }

    public void imprimeMedia() {
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];

        }
        double result = (soma / salarios.length);
        System.out.println("\n media salarial é: " + result);
    }


}
