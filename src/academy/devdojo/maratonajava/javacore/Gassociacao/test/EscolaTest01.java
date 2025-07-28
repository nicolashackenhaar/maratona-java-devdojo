package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Girafales");
        Professor professor2 = new Professor("clotilde");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Escolinha do chaves", professores);

        escola.imprime();
    }
}
